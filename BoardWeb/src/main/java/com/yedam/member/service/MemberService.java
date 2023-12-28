package com.yedam.member.service;

import java.util.List;

import com.yedam.board.vo.BoardVO;
import com.yedam.member.vo.MemberVO;

public interface MemberService {
	public MemberVO login(String id, String pw);
	public List<MemberVO> memberList(); //멤머 목록 
	public MemberVO getMember (String id); //id로 단건출력
}
