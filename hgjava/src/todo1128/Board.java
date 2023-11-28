package todo1128;

public class Board {
	private int boardNum ; 
	private String boardTitle;
	private String boardUser;
	private String boardText;
	private String boardDate;

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
