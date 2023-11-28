package chapter4;

import java.util.*;

public class Exam160 {

	public static void main(String[] args) {
		//2번 문제 
		int three = 0;
		for(int i = 1; i<=100; i++){
			if(i % 3 ==0) {
				three += i;
		}
		}System.out.println("3배수의 총합은:"+ three);
		
		//3번 문제 
		while(true) {
			int nun1 = (int)(Math.random()*6)+1;
			int nun2 = (int)(Math.random()*6)+1;
			System.out.printf("(%d,%d)\n,",nun1, nun2);
			if(nun1+nun2 == 5) {
				break;
			}
		}System.out.println("종료");
		
		
		//문제 4
		
		//x: 1~10까지 반복
		//y: 1~10까지 반복
		int x = 1;
		int y = 1;
		for(x = 1; x <=10;x++) {
			for(y = 1; y <= 10;y++) {
				if((4*x) + (5*y) == 60) {
					System.out.println("("+ x + "," + y + ")");
				}
				//4*x +5*y = 60인 값 찾기 
			}
		}
		
		//5번 문제 
		
//				for(int i = 1; i<5;i++) {
//					for(int j = 1; j<5; j++) {
//						String stars ="";
//						stars += "*";
//						
//						System.out.println(stars);
//					}
//				}
//		
		
		//7번 문제 
		
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		
		while(run) {
			System.out.println("-----------------------");
			System.out.println("1.예금| 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------");
			System.out.println("선택>");
			int num = scanner.nextInt();
			
			switch(num) {
			case 1: System.out.println("예금액:");
			int deposit = scanner.nextInt();
			balance += deposit; 
			break;
			
			case 2: System.out.println("출금액:");
			int withdraw = scanner.nextInt();
			if(balance < withdraw) {
				System.out.println("잔고가 부족합니다");
			}else {
				balance -= withdraw;
			}break;
			
			case 3: System.out.println("잔고:");
			System.out.println(balance);break;
			
			case 4: run = false; 
			}
		}
		System.out.println("프로그램 종료");
	}//end main

} //end class