package chapter4;

import java.util.*;

public class Exam160 {

	public static void main(String[] args) {
		//2�� ���� 
		int three = 0;
		for(int i = 1; i<=100; i++){
			if(i % 3 ==0) {
				three += i;
		}
		}System.out.println("3����� ������:"+ three);
		
		//3�� ���� 
		while(true) {
			int nun1 = (int)(Math.random()*6)+1;
			int nun2 = (int)(Math.random()*6)+1;
			System.out.printf("(%d,%d)\n,",nun1, nun2);
			if(nun1+nun2 == 5) {
				break;
			}
		}System.out.println("����");
		
		
		//���� 4
		
		//x: 1~10���� �ݺ�
		//y: 1~10���� �ݺ�
		int x = 1;
		int y = 1;
		for(x = 1; x <=10;x++) {
			for(y = 1; y <= 10;y++) {
				if((4*x) + (5*y) == 60) {
					System.out.println("("+ x + "," + y + ")");
				}
				//4*x +5*y = 60�� �� ã�� 
			}
		}
		
		//5�� ���� 
		
//				for(int i = 1; i<5;i++) {
//					for(int j = 1; j<5; j++) {
//						String stars ="";
//						stars += "*";
//						
//						System.out.println(stars);
//					}
//				}
//		
		
		//7�� ���� 
		
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		
		while(run) {
			System.out.println("-----------------------");
			System.out.println("1.����| 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-----------------------");
			System.out.println("����>");
			int num = scanner.nextInt();
			
			switch(num) {
			case 1: System.out.println("���ݾ�:");
			int deposit = scanner.nextInt();
			balance += deposit; 
			break;
			
			case 2: System.out.println("��ݾ�:");
			int withdraw = scanner.nextInt();
			if(balance < withdraw) {
				System.out.println("�ܰ� �����մϴ�");
			}else {
				balance -= withdraw;
			}break;
			
			case 3: System.out.println("�ܰ�:");
			System.out.println(balance);break;
			
			case 4: run = false; 
			}
		}
		System.out.println("���α׷� ����");
	}//end main

} //end class
