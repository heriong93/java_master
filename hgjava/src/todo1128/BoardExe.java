package todo1128;

import java.text.SimpleDateFormat;
import java.util.Date;

//저장소 boards
public class BoardExe {
	static Board[] boards;

	BoardExe() {
	//	boards = new Board[100];
	}
	static {
		boards = new Board[100];
	}
	

	// 초기값 생성
	public static void initData() {
		boards[0] = new Board(1, "첫번째 글", "user01", "첫번째 글 입력중입니다", "2023-12-12");
		boards[1] = new Board(2, "두번째 글", "user02", "두번째 글 입력중입니다", "2023-12-13");
	                                                                                     // boards[2] <-- 새로운 글을 등록하면 5번글이 이 배열에 입력됨.글의 순서가 맞지 않음 boardList
		boards[2] = new Board(3, "세번째 글", "user03", "세번째 글 입력중입니다", "2023-12-15");
		boards[3] = new Board(4, "네번째 글", "user04", "네번째 글 입력중입니다", "2023-12-15");
		boards[4] = new Board(5, "다섯번째 글", "user05", "다섯번째 글 입력중입니다", "2023-12-15");
		boards[5] = new Board(6, "여섯번째 글", "user06", "여섯번째 글 입력중입니다", "2023-12-15");
		boards[6] = new Board(7, "일곱번째 글", "user07", "일곱번째 글 입력중입니다", "2023-12-15");
		boards[7] = new Board(8, "여덟번째 글", "user08", "여덟번째 글 입력중입니다", "2023-12-13");

	}

	// 등록 /글번호/ 제목/ 작성자/ 내용 /작성일시 => 반환값은 boolean
	// method 생성
	public static boolean addBoard(Board board) { // 하나하나 다 적으려면 너무 많으니 보드 클래스로 잡아줌
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] == null) {
				boards[i] = board;
				return true; // break; //반복문 종료
			}
		}
		return false;
	}

	// 목록. 반환값: 배열
	public static Board[] boardList() {
		// boards = 새로운 배열에 정렬된 값으로 바꾼다음 반환.
		Board temp = null;
		for (int j = 0; j < boards.length - 1; j++) {
			for (int i = 0; i < boards.length; i++) {
				if (boards[i] != null && boards[i + 1] != null) {
					if (boards[i].getBoardNum() > boards[i + 1].getBoardNum()) {
						temp = boards[i];
						boards[i] = boards[i + 1];
						boards[i + 1] = temp;
					}
				}
			}
		}
		return boards;
	}

//	배열, 페이지 => 페이지의 5건을 반환. 
	public static Board[] pageList(Board[] ary, int page) { // 페이지 계산
		Board[] resultAry = new Board[5];

		int start = (page - 1) * 5; // 페이지 시작
		int end = page * 5; // 페이지 끝
		int j = 0;
		for (int i = 0; i < ary.length; i++) {
			if (i >= start && i < end) {
				resultAry[j++] = ary[i]; // 새로운 배열을 받아서
			}
		}
		return resultAry; // 반환하겠다
	}

	// 단건 조회. 매개변수: 글번호, 반환하는 값: Board
	public static Board getBoard(int boardNo) {
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getBoardNum() == boardNo) {
				return boards[i];
			}
		}
		return null;
	}

	// 신규번호 생성 메소드 : 현재 글 번호에서 +1 반환
	public static int getSequence() {
		// 배열에서 글번호 중 제일 큰 번호 가져오기
		int max = 0;
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getBoardNum() > max) {
				max = boards[i].getBoardNum();

			}
		}
		int seqNo = max + 1; // 가장 큰 번호 뒤로 게시번호 생성
		return seqNo;
	}

	// 수정. 매개값은 (글번호, 내용,) => 수정이 되었는지 확인 위해 boolean type
	public static boolean modBoard(int no, String content) {
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getBoardNum() == no) {
				boards[i].setBoardText(content); // boardText 내용을 content로 대체해라
				boards[i].setBoardDate(sdf.format(today));
				return true;
			}
		}
		return false;
	}

	// 삭제. 매개값(글번호) => boolean
	public static boolean remBoard(int no) {
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getBoardNum() == no) {
				boards[i] = null;
				return true;
			}
		}
		return false;
	}

	// 사용자가 해당글 번호의 수정 혹은 삭제권한이 있는지 체크. 권한 있을 시 => true 없으면false (boolean)
	public static boolean checkRespons(String id, int no) {
		System.out.println();
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getBoardNum() == no && boards[i].getBoardUser().equals(id)) {
				return true;
			}
		}
		return false;
	}
	
	//게시글을 담고 있는 배열에서 값이 있는 건수를 반환
	public static int getBoardCount() {
		int realCount = 0; 
		for(int i = 0 ; i < boards.length; i++) {
			if(boards[i] != null) {
				realCount++;
			}
		}return realCount;
	}
}
