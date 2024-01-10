package com.yedam.member.command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.common.Control;

public class MemberListAjax implements Control {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		
		RequestDispatcher rd = req.getRequestDispatcher("admin/memberListAjax.tiles"); // 이동할 페이지 tiles.xml에 먼저 지정해줘야함
		try {
			rd.forward(req, resp);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
		
	}
	}

