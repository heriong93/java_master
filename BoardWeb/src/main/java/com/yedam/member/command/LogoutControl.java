package com.yedam.member.command;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yedam.common.Control;

public class LogoutControl implements Control {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		//로그아웃..세션 삭제 
		HttpSession session = req.getSession();
		session.invalidate();
		
		try {
			resp.sendRedirect("loginForm.do");   //sendRedirect는 값을 다시 받을 필요없을때 이동만 시켜줌
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
