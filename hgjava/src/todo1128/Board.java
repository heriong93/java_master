package todo1128;

import java.text.SimpleDateFormat;
import java.util.Date;
import lombok.Data;
@Data 
public class Board {
	
	
	private int boardNum ;      //private 일 경우 get set 으로 값을 불러오거나 지정해줘야한다.잘못된 값을 설정하는걸 막기 위해  
	private String boardUser;
	private String boardTitle;
	private String boardText;
	private String boardDate;

	
	public Board(){
		
	};

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
		this(boardNum, boardTitle, boardUser, boardText);
//		this.boardNum = boardNum;  //다 쓰지 않고 위의 한 줄로 대체할 수 있음 
//		this.boardTitle = boardTitle;
//		this.boardUser = boardUser;
//		this.boardText = boardText;
		this.boardDate = boardDate; //+ 나머지 추가 
	}
	public String boardShortInfo() {
		return boardNum+"- 제목은 "+" "+boardTitle+"  "+ boardUser+ " "+boardDate;
	}
	
	public String boardAllInfo() {
		String result = "번호: "+boardNum+"  "+"제목 :"+boardTitle;
		result += "\n"+"작성자: "+boardUser;
		result += "\n"+"내용: "+boardText;
		result += "\n"+"일시: "+boardDate;
		return result; 
	}

	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public void setBoardUser(String boardUser) {
		this.boardUser = boardUser;
	}

	public void setBoardText(String boardText) {
		this.boardText = boardText;
	}

	public void setBoardDate(String boardDate) {
		this.boardDate = boardDate;
	}

	public int getBoardNum() {
		return boardNum;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public String getBoardUser() {
		return boardUser;
	}

	public String getBoardText() {
		return boardText;
	}

	public String getBoardDate() {
		return boardDate;
	}
}
