package com.yedam.board.command;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.yedam.board.service.BoardService;
import com.yedam.board.serviceImpl.BoardServiceMybatis;
import com.yedam.board.vo.BoardVO;
import com.yedam.common.Control;

public class AddBoardControl implements Control {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		// 파라메터 (3개), db 에 insert, 목록 페이지
		// get요청일 때/ post요청일 때
		BoardVO vo = new BoardVO();

		if (req.getMethod().equals("GET")) {
			// 파일 업로드 없을때
			String title = req.getParameter("title"); // 파라메터의 이름 ex)title,content,writer
			String content = req.getParameter("content");
			String writer = req.getParameter("writer");

			vo.setTitle(title);
			vo.setContent(content);
			vo.setWriter(writer);

		} else if (req.getMethod().equals("POST")) {  //method="post"넣어준 부분은 addBoardForm.jsp에 있음
			// 파일 업로드 포함
			String saveLoc = req.getServletContext().getRealPath("images"); // images폴더의 경로를 찾아 업로드 하겠습니다.폴더 위치에 없어서 만들어줌
			int maxSize = 1024 * 1024 * 5;
			MultipartRequest mr = null;
			// mr= 속성들 1.request 2.saveLoc 3.maxSize 4.인코딩 방식 5.중복이 있을 시 리네임 정책
			// 5.D:\JAVA_WS\.metadata\.plugins\org.eclipse.wst.server.core\tmp1\wtpwebapps\BoardWeb\images
			// 확인가능
			try {
				mr = new MultipartRequest(req, saveLoc, maxSize, "utf-8", new DefaultFileRenamePolicy());
				String title = mr.getParameter("title");
				String content = mr.getParameter("content");
				String writer = mr.getParameter("writer");
				String image = mr.getFilesystemName("image");

				vo.setTitle(title);
				vo.setContent(content);
				vo.setWriter(writer);
				vo.setImage(image);

			} catch (IOException e) {
				e.printStackTrace();
			}
		}//end of if
		//두가지 다 이 방법을 사용해야해서 if문 밖으로 빼냄 
		// svc : addBoard();
		BoardService svc = new BoardServiceMybatis();
		if (svc.addBoard(vo)) { // 등록 성공시
			try {
				resp.sendRedirect("boardList.do");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else { // 등록 안될 시
			try {
				resp.sendRedirect("boardForm.do");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}// END OF EXECUTE

}
