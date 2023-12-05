package todo1205;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpApp {
	static List<Emp> enterprise = new ArrayList<>();
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.println("1-등록 2-목록 3-수정(급여) 4-삭제 5-조회");
			int choice = Integer.parseInt(sc.nextLine());
			switch(choice) {
			case 1: 
				System.out.println("사번 입력:");
				String num = sc.nextLine();
				System.out.println("이름 입력:");
				String name = sc.nextLine();
				System.out.println("전화번호 입력:");
				String phone = sc.nextLine();
				System.out.println("입사일자 입력:");
				String entry = sc.nextLine();
				System.out.println("급여 입력:");
				String pay = sc.nextLine();
				enterprise.add(new Emp(num,name,phone,entry,pay));
				break;
			case 2: 
				
				break;
			case 3: 
				break;
			case 4: 
				break;
			case 5: 
				break;
			default:
			}
		}
		
	}
}
