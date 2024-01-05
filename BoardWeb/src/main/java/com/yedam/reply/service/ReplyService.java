package com.yedam.reply.service;

import java.util.List;

import com.yedam.reply.vo.ReplyVO;

//순서3 - 목록 가져오기 
//replyserviceImpl 생성 
public interface ReplyService {
	List<ReplyVO> replyList(int boardNo); //댓글 목록
	List<ReplyVO> replyListPaging(int boardNo, int page); //댓글 페이징
	boolean removeReply(int replyNo); //삭제
	boolean addReply(ReplyVO vo); //댓글 등록 
	ReplyVO getReply(int replyNo);
	
}
