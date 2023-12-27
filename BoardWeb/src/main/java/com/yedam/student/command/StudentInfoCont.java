package com.yedam.student.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.common.Control;

public class StudentInfoCont implements Control {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		try {
			//tiles로 끝이 나면 web.xml의 tilesdispatchservlet이 시작됨 그러면 가장 먼저 읽어들이는게 tiles.xml 
			req.getRequestDispatcher("student/studentInfo.tiles").forward(req, resp);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
