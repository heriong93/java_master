package com.yedam.common;

import com.yedam.member.service.MemberService;
import com.yedam.member.serviceImpl.MemberServiceImpl;
import com.yedam.member.vo.MemberVO;
import com.yedam.reply.service.ReplyService;
import com.yedam.reply.serviceImpl.ReplyServiceImpl;
//5 main.exe수정 후 frontcontroller등록해주기 
public class MainExe {
	public static void main(String[] args) {
		ReplyService svc = new ReplyServiceImpl();
		svc.replyListPaging(14,1).forEach(reply -> System.out.println(reply)); //14번이 보드넘버

	}
}
