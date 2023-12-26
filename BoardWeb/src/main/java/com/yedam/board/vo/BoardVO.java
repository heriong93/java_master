package com.yedam.board.vo;

import java.util.Date;

import lombok.Data;

@Data
public class BoardVO {
	private int boardNo;
	private String title;
	private String content;
	private String writer;
	private Date writeDate;
	private int clickCnt;
	private String image;
	public void updateBoard(String string) {
		
	}
	public int getBoardNo() {
		return boardNo;
	}
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public String getWriter() {
		return writer;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public int getClickCnt() {
		return clickCnt;
	}
	public String getImage() {
		return image;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	public void setClickCnt(int clickCnt) {
		this.clickCnt = clickCnt;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
}
