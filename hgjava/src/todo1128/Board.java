package todo1128;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Board {
	
	
	private int boardNum ; 
	private String boardUser;
	private String boardTitle;
	private String boardText;
	private String boardDate;

	public Board(int boardNum, String boardTitle, String boardUser){
		this.boardNum = boardNum;
		this.boardTitle = boardTitle;
		this.boardUser = boardUser;
	}
	
	public Board(int boardNum, String boardTitle, String boardUser, String boardText) {
		Date today = new Date();  //시스템 시간 기준으로 생성 
		
		//date -> String -> date 변경시켜주는 포맷 SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		this.boardNum = boardNum;
		this.boardTitle = boardTitle;
		this.boardUser = boardUser;
		this.boardText = boardText;
		this.boardDate = sdf.format(today); 
	}
	//나도 변경했습니다
	public Board(int boardNum, String boardTitle, String boardUser, String boardText, String boardDate) {
		this.boardNum = boardNum;
		this.boardTitle = boardTitle;
		this.boardUser = boardUser;
		this.boardText = boardText;
		this.boardDate = boardDate;
	}
	String boardShortInfo() {
		return boardNum+"- 제목은 "+" "+boardTitle+"  "+ boardUser+ " "+boardDate;
	}
	
	String boardAllInfo() {
		String result = "번호: "+boardNum+"  "+"제목 :"+boardTitle;
		result += "\n"+"작성자: "+boardUser;
		result += "\n"+"내용: "+boardText;
		result += "\n"+"일시: "+boardDate;
		return result; 
	}

	void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}

	void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	void setBoardUser(String boardUser) {
		this.boardUser = boardUser;
	}

 void setBoardText(String boardText) {
		this.boardText = boardText;
	}

	void setBoardDate(String boardDate) {
		this.boardDate = boardDate;
	}

	int getBoardNum() {
		return boardNum;
	}

	String getBoardTitle() {
		return boardTitle;
	}

	String getBoardUser() {
		return boardUser;
	}

	String getBoardText() {
		return boardText;
	}

	String getBoardDate() {
		return boardDate;
	}
}
