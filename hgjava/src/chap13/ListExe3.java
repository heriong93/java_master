package chap13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListExe3 {

	public static void main(String[] args) {
		// 회원등록(회원번호, 이름, 포인트)
		// 1. 등록 2. 이름조회(이름은 중복되면 다 출력되도록) 3. 포인트 변경 4. 삭제(한 건 기준) 5. 종료
		List<Member> members = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		String name = null;
		while (run) {
			System.out.println("1.등록 2.조회 3.포인트 변경 4.삭제 5.종료");
			int menu = Integer.parseInt(sc.nextLine());
			switch (menu) {
			case 1:
				System.out.println("회원번호 입력:");
				String num = sc.nextLine();
				System.out.println("등록하실 성함 입력:");
				name = sc.nextLine();
				System.out.println("포인트:");
				String point = sc.nextLine();

				for (int i = 0; i < members.size(); i++) {
					if (members.get(i) == null) {
						members.add(new Member(num, name, point));
					}
				}
				break;
			case 2:
				System.out.println("조회하실 이름 입력:");
				name = sc.nextLine();
				for (int i = 0; i < members.size(); i++) {
					if (name.equals(members.get(i).getMemberName())) {
						System.out.println(members.get(i).getMembeNum()+members.get(i).getMemberName()+members.get(i).getPoint());
					}
				}
				break;
			case 3:System.out.println("포인트 변경 할 회원 이름:");
			name = sc.nextLine();
			for(int i  = 0; i < members.size();i++) {
				if()
			}
			
				
				break;
			case 4:break;
			default:
				System.out.println("종료합니다");
				run = false;
			}// end of switch
		} // end of while

	}// end of main
}// end of class
