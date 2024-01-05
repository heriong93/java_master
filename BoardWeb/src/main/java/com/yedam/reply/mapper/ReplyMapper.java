package com.yedam.reply.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yedam.reply.vo.ReplyVO;

//순서2 mybatis mapper, alias 등록 후 생성 interface 
//replymapper.xml 생성해주기 -- 쿼리 등록
//replyservice에도 등록 
public interface ReplyMapper {
	List<ReplyVO> replyList(int boardNo); //몇번 글에 대한 댓글인지 알아야하기 때문에 매개값boardNo
	List<ReplyVO> replyListPaging(@Param("boardNo")int boardNo,@Param("page") int page); //페이징 @param으로 파라미터 타입 미리 지정해놓음
	int deleteReply(int replyNo); //댓글삭제
	int insertReply(ReplyVO vo); //댓글 등록 
	ReplyVO selectReply(int replyNo);
	
	
	
	

}
