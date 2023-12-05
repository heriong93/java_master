package todo1205;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//1.등록 2.목록 3. 수정 4.삭제 5.종료
public class BookApp {
	public static void main(String []args) {
		List<Book> books = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	boolean run = true ; 
	BookExe exe = new BookExe();
	
	while(run) {
		System.out.println("1.등록 2. 목록 3. 수정 4. 삭제 5. 종료");
		System.out.println("================================");
		int choice = Integer.parseInt(sc.nextLine());
		switch(choice) {
		case 1: 
			
			System.out.println("1)도서코드 입력>>");
			String bnum = sc.nextLine();
			System.out.println("2)도서명 입력>>");
			String bname = sc.nextLine();
			System.out.println("3)저자 입력>>");
			String baut = sc.nextLine();
			System.out.println("4)출판사 입력>>");
			String bcom = sc.nextLine();
			System.out.println("5)가격 입력>>");
			String bpri = sc.nextLine();
			
			books.add(new Book(bnum,bname,baut,bcom,bpri));
			System.out.println("저장되었습니다");
			break;
		case 2:
			System.out.println("도서코드"+"\t도서명"+"\t저자"+"\t가격");
			for(Book book : books) {
				book.showInfo();
			}
			break; 
		case 3: 
			System.out.println("1)도서코드입력>>");
			String bnu = sc.nextLine();
			System.out.println("2)도서가격입력>>");
			String bprice = sc.nextLine();
			if(exe.modifyBookp(bnu,bprice)){
				System.out.println("수정되었습니다");
			}else {
				System.out.println("수정에 실패하였습니다");
			}
			break; 
		case 4: 
			break;
		case 5: System.out.println("프로그램을 종료합니다");
		run = false;
		}//end of switch
	}//end of while
	System.out.println("end of prog.");
	}//end of main	
}//end of class
