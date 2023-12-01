package chapter10;

import java.util.Scanner;

public class NumberExceptionExe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int menu = 0;
		while(true) {
			System.out.println("1.추가 2.삭제 3.종료");
			try {
				menu = Integer.parseInt(sc.nextLine());
			}catch(NumberFormatException e) {
				System.out.println("숫자를 입력하세요");
		
			}
			switch(menu) {
			case 1:
				System.out.println("추가합니다");
				break;
			case 2: 
				System.out.println("삭제합니다");
				break;
			case 3:
				System.out.println("종료합니다");
				run = false;
			}
		}
	}
}
