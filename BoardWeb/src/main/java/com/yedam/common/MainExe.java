package com.yedam.common;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yedam.board.mapper.BoardMapper;
import com.yedam.board.vo.BoardVO;


public class MainExe {
	public static void main(String[] args) {
		SqlSessionFactory factory = DataSource.getInstance();
		SqlSession session = factory.openSession(true);
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		
		//전체 목록 조회 selectList
		List<BoardVO> list = mapper.selectList();
		for(BoardVO vo : list) {
			System.out.println(vo.toString());
		}
		
		//단건조회 selectOne
		System.out.println(mapper.selectOne(8));
		
		//목록 추가 insertBoard
		BoardVO vo = new BoardVO();
		vo.setTitle("추가연습중");
		vo.setWriter("박혜령");
		vo.setContent("추가추가추가추가");
		if(mapper.insertBoard(vo)==1){
			System.out.println("목록 추가 완료");
		}else {
			System.out.println("목록 추가 실패");
		}
		
//		//수정 updateBoard
		
		vo.setContent("수정중");
		vo.setBoardNo(4);
		if(mapper.updateBoard(vo)==1) {
			System.out.println("글 수정 완료");
		}else {
			System.out.println("글 수정 실패");
		}
		
		
		//삭제 
		if(mapper.deleteBoard(5)==1) {
			System.out.println("삭제 완료");
		}else {
			System.out.println("삭제 실패");
		}
		
		//조회수 증가 -8번 게시물에 조회수 1추가 
		if(mapper.updateCnt(8)==1) {
			System.out.println("조회수 업데이트완료");
		}else {
			System.out.println("조회수 업데이트 실패");
		}
	}
}
