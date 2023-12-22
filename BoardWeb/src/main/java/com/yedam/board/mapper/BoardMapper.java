package com.yedam.board.mapper;

import java.util.List;

import com.yedam.board.vo.BoardVO;

public interface BoardMapper {
	//데이터베이스 처리해주는 부분 
	
	//목록, 단건조회, 추가수정, 삭제, 조회수 증가 
	List<BoardVO> selectList();  //목록
	BoardVO selectOne (int bno); //단건조회 
	int insertBoard (BoardVO vo);    //추가
	int updateBoard(BoardVO vo); //수정 
	int deleteBoard (int bno); //삭제
	int updateCnt (int bno); //조회수 증가 
}
