package com.yedam.board.command;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.board.service.BoardService;
import com.yedam.board.serviceImpl.BoardServiceMybatis;
import com.yedam.board.vo.BoardVO;
import com.yedam.common.Control;

public class AddBoardControl implements Control {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		// 파라메터 (3개), db 에 insert, 목록 페이지

		String title = req.getParameter("title"); // 파라메터의 이름 ex)title,content,writer
		String content = req.getParameter("content");
		String writer = req.getParameter("writer");

		BoardVO vo = new BoardVO();
		vo.setTitle(title);
		vo.setContent(content);
		vo.setWriter(writer);

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
	}

}
