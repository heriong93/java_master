package com.yedam.reply.command;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.common.Control;
import com.yedam.reply.service.ReplyService;
import com.yedam.reply.serviceImpl.ReplyServiceImpl;
import com.yedam.reply.vo.ReplyVO;
//순서6 데이터 반환. 게시글에 댓글 적용시켜줘야하기 때문에 getboard.jsp에 등록해야함 web-inf -> board -> 에 있음 
public class ReplyListJson implements Control {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		//json 데이터를 생성해서 반환 
		//[{"replyNo":1,"boardNo":14, "reply": 안녕하세요~ 반갑습니다, .......},{}]
		resp.setContentType("text/json;charset=utf-8");
		String bno = req.getParameter("bno");
		String page = req.getParameter("page");
		page = page == null ? "1" : page; //페이지 번호 파라메터 없으면 1번째 페이지 출력
		
		ReplyService svc = new ReplyServiceImpl();
		List<ReplyVO> list = svc.replyListPaging(Integer.parseInt(bno),Integer.parseInt(page)); //게시글 번호에 따라 출력 
		
		int cnt = list.size();
		String json = "[";
		for(int i = 0; i < cnt;i++) {
			json += "{\"replyNo\": " + list.get(i).getReplyNo() + ",\"boardNo\":" +list.get(i).getBoardNo()+",\"reply\":\""+list.get(i).getReply()+ "\",\"name\":\"" +list.get(i).getName()+"\"}";
			if(i != cnt -1) { //마지막이 아닐경우 
				json += ",";
			}
		}
		json += "]";
		
		try {
			resp.getWriter().print(json);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
