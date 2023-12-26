package com.yedam.board.command;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.board.service.BoardService;
import com.yedam.board.serviceImpl.BoardServiceMybatis;
import com.yedam.board.vo.BoardVO;
import com.yedam.common.Control;

public class ModifyBoardControl implements Control {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		String bno = req.getParameter("bno");
		String content = req.getParameter("content");
		
		BoardService svc = new BoardServiceMybatis();
		BoardVO vo = svc.getBoard(Integer.parseInt(bno)); //목록번호 파라미터 가져오기 
		vo.setContent(content);  //수정된 게시글 등록 
		if (svc.modBoard(vo)) { // 등록 성공시
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
	}
}


