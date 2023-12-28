package com.yedam.member.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.yedam.board.mapper.BoardMapper;
import com.yedam.common.DataSource;
import com.yedam.member.mapper.MemberMapper;
import com.yedam.member.service.MemberService;
import com.yedam.member.vo.MemberVO;

public class MemberServiceImpl implements MemberService{
	SqlSession session = DataSource.getInstance().openSession(true);
	MemberMapper mapper = session.getMapper(MemberMapper.class);   //이 규칙은 어떻게 가져오는지 알수없음.그냥 이대로 씀 
	@Override
	public MemberVO login(String id, String pw) {
		return mapper.selectMember(id,pw);
	}
	@Override
	public List<MemberVO> memberList() {
		return mapper.selectList();
	}
	public MemberVO getMember(String id) {
		return mapper.selectOne(id);
	}
	
}
