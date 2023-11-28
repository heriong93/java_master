package todo1128;

public class Board {
	
	private Board[] boards;
	
	int boardNum ; 
	String boardUser;
	String boardTitle;
	String boardText;
	String boardDate;

	Board(int boardNum, String boardTitle, String boardUser){
		this.boardNum = boardNum;
		this.boardTitle = boardTitle;
		this.boardUser = boardUser;
	}
	
	public Board(int boardNum, String boardTitle, String boardUser, String boardText, String boardDate) {
		this.boardNum = boardNum;
		this.boardTitle = boardTitle;
		this.boardUser = boardUser;
		this.boardText = boardText;
		this.boardDate = boardDate;
	}
	void boardShortInfo() {
		System.out.println(boardNum+"- 제목은 "+boardTitle+ boardUser);
	}
	
	void boardAllInfo() {
		System.out.println("번호: "+boardNum+"/"+"제목 :"+boardTitle);
		System.out.println("작성자: "+boardUser);
		System.out.println("내용: "+boardText);
		System.out.println("일시: "+boardDate);
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
	
	Board getboard(String num) {
		for(int i = 0; i < boards.length; i++) {
			if(boards[i] != null && boards[i].getBoardNum()==(num)) {
				return boards[i];
			}
		}
	}
	
	
	
	
}
