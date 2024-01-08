package com.yedam.common;

import java.util.HashMap;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.yedam.member.service.MemberService;
import com.yedam.member.serviceImpl.MemberServiceImpl;
import com.yedam.member.vo.MemberVO;
import com.yedam.reply.service.ReplyService;
import com.yedam.reply.serviceImpl.ReplyServiceImpl;
import com.yedam.reply.vo.PageDTO;
//5 main.exe수정 후 frontcontroller등록해주기 
public class MainExe {
	public static void main(String[] args) {
		
		ReplyService svc = new ReplyServiceImpl();
		List<HashMap<String,Object>> list = svc.chartData();
		Gson gson = new GsonBuilder().create();
		System.out.println(gson.toJson(list));
//		svc.replyListPaging(14,1).forEach(reply -> System.out.println(reply)); //14번이 보드넘버
		
//		int total = 70;
//		PageDTO dto = new PageDTO(13, total);  //현재 페이지 
//
//		System.out.println(dto.toString());
}
}
