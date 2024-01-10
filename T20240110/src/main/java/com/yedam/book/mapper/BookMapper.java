package com.yedam.book.mapper;

import java.util.List;

import com.yedam.book.vo.BookVO;

public interface BookMapper {
	List<BookVO> bookList(); //목록 출력
}
