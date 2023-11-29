package todo1128;

import java.util.Scanner;

import chapter6.User;
import chapter6.UserExe;

public class BoardApp {
	static BoardExe exe = new BoardExe();
	public static void main(String[] args) {
//		Board [] boards = new Board [100];
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		String id = null;

		UserExe uexe = new UserExe();

		while (true) {
			System.out.println("id를 입력:");
			id = sc.nextLine();
			System.out.println("pw를 입력:");
			String pw = sc.nextLine();
			User user = uexe.logIn(id, pw);
			if (user != null) {
				System.out.println(user.getUserName() + "님 환영합니다");
				break;
			} else {
				System.out.println("id, pw 확인하세요!");
			}
		}
		
		// 초기값 생성
		exe.initData();

		while (run) {
			System.out.println("1.등록 2.목록 3.상세조회 4.수정 5.삭제 6.종료 ");
			System.out.println("-----------------------------");
			int choice = Integer.parseInt(sc.nextLine());

			switch (choice) {
			case 1:
				System.out.println("게시할 글의 제목을 적어주세요");
				String title = sc.nextLine();
//				System.out.println("사용자명을 입력해주세요");
//				String uname = sc.nextLine();  //사용자 입력 대신 아이디 로그인으로 변경
				System.out.println("하고싶은 말을 적어주세요");
				String issue = sc.nextLine();
				System.out.println("오늘의 날짜를 기재해주세요 YYYY-MM-DD");
				String date = sc.nextLine();

				Board brd = new Board(exe.getSequence(), title, issue, date);

				if (exe.addBoard(brd)) {
					System.out.println("입력 성공");
				} else {
					System.out.println("처리 실패");
				}
				break;

			case 2: //목록보기 -> 페이지 보기 
				//페이징 처리
				Board[] boardAry = exe.boardList(); // 목록 반환값:배열로 정리해주기
				showList(boardAry, 1); //전체페이지 중에서 1페이지만 보겟다 
				while(true) {
					int page = Integer.parseInt(sc.nextLine());
					if(page == 0 ) {
						break;
					}
					showList(boardAry, page);
				}
					break;
			case 3:
				System.out.println("글번호 입력");
				int no = Integer.parseInt(sc.nextLine());
				Board result = exe.getBoard(no);
				if (result != null) {
					System.out.println(result.boardAllInfo());
				} else {
					System.out.println("조회된 내용이 없습니다");
				}
				break;

			case 4: // 수정
				System.out.println("수정할 번호 입력: ");
				no = Integer.parseInt(sc.nextLine());
				if(!exe.checkRespons(id, no)) { //!붙이면 false 의미
					System.out.println("권한이 없습니다");
					continue;
				}
				System.out.println("수정할 글 내용: ");
				String content = sc.nextLine();
				if (exe.modBoard(no, content)) {
					System.out.println("변경 성공!");
				} else {
					System.out.println("처리 실패!");
				}
				break;
			case 5:
				// 삭제. 매개값(글번호) => boolean
				System.out.println("삭제할 글번호 입력: ");
				no = Integer.parseInt(sc.nextLine());
				if(!exe.checkRespons(id,no)) { //!붙이면 false 의미
					System.out.println("삭제 권한이 없습니다");
					continue;
				}
				if (exe.remBoard(no)) {
					System.out.println("삭제 성공!");
				} else {
					System.out.println("처리 실패!");
				}
				break;
			case 6:
				System.out.println("프로그램 종료합니다");
				run = false;

			}// end of switch
		} // end of while
		System.out.println("end of prog.");

	}// end of main
	
	public static void showList(Board[] boardAry, int page) {  //페이지의 5개만 가져와서 보여주세요
		Board[] pageAry = exe.pageList(boardAry, page); //전체 건수 중 1번의 페이지만 가져오겟다 
		System.out.println("글번호 제목     작성자");
		System.out.println("=================");
		for (Board board : pageAry) {
			if (board != null) {
				System.out.println(board.boardShortInfo());
			}
		}
			//전체페이지 계산하고 출력
			int cnt = exe.getBoardCount();
			int totalPage = (int)Math.ceil(cnt/5.0);  //게시물을 페이지 수로 나누기 위해 계산
			
			for(int i = 1; i <= totalPage; i++) {  //1페이지 2페이지 찍어주는 기능 
				System.out.print(i + " ");
			}
			System.out.println("\n 페이지를 선택하세요:  (종료=> 0 입력) ");
	}
	
}// end of class
