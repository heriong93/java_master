package com.yedam.board.command;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.board.service.BoardService;
import com.yedam.board.serviceImpl.BoardServiceMybatis;
import com.yedam.board.vo.BoardVO;
import com.yedam.common.Control;

public class BoardListControl implements Control {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		// 게시글 목록 -> boardList.jsp로 전달
		BoardService svc = new BoardServiceMybatis();
		List<BoardVO> list = svc.boardList();

		req.setAttribute("boardList", list); // 속성 값 추가하는 것

		// 페이지 이동(foward)
		RequestDispatcher rd = req.getRequestDispatcher("board/boardList.tiles"); // 이동할 페이지 tiles.xml에 먼저 지정해줘야함
		try {
			rd.forward(req, resp);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}

}
