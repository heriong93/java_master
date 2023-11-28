package todo1128;

import java.util.Scanner;

public class BoardApp {

	public static void main(String[] args) {
		Board [] boards = new Board [100];
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		while(run) {
			System.out.println("1.등록 2. 목록 3. 상세조회 4. 종료 ");
			System.out.println("-----------------------------");
			int choice = Integer.parseInt(sc.nextLine());
			
			switch(choice) {
			case 1:System.out.println("게시글 번호를 입력하세요");
			int num = Integer.parseInt(sc.nextLine());
//			for(int i = 0; i<boards.length; i++) {
//				if( boards[i] != null && boards[i].getBoardNum() == num) {
//					System.out.println("중복된 게시글 번호입니다");
//				}
					System.out.println("사용자명을 입력해주세요");
					String uname = sc.nextLine();
					System.out.println("게시할 글의 제목을 적어주세요");
					String title = sc.nextLine();
					System.out.println("하고싶은 말을 적어주세요");
					String issue = sc.nextLine();
					System.out.println("오늘의 날짜를 기재해주세요 YYYY-MM-DD");
					String date = sc.nextLine();
					
					Board brd = new Board (num,uname, title, issue, date);
					for(int i = 0; i< boards.length; i++) {
						if(boards[i] == null) {
							boards[i] = brd;
							break;
						}
					}
				break;
			case 2: 
				Board short = new Board (num,title,uname);
				short.boardShortInfo();
				break;
			case 3: 
				break;
			case 4: 
				break;
		}//end of switch
		}//end of while

	}//end of main
}//end of class

