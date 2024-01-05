package com.yedam.reply.command;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.common.Control;
import com.yedam.reply.service.ReplyService;
import com.yedam.reply.serviceImpl.ReplyServiceImpl;

public class DelReplyJson implements Control {
//순서 9 - replymapper.xml 삭제 쿼리 추가  
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		String rno = req.getParameter("rno");
		
		ReplyService svc = new ReplyServiceImpl();
		
		try {
			if(svc.removeReply(Integer.parseInt(rno))) {
				//{"retCode":OK"}
				resp.getWriter().print("{\"retCode\": \"OK\"}");
			}else {
				//{"retCode":NG"}
				resp.getWriter().print("{\"retCode\": \"NG\"}");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
