package chapter4;

import java.util.Scanner;

public class Game2 {

	public static void main(String[] args) {
		//���� ��ȯ
		Scanner sc = new Scanner(System.in);
		System.out.print("##��ȯ�� �ݾ�:");
		int money = sc.nextInt();
		
		
		System.out.println("500�� ¥��:"+money/500);
		int left = money % 500;
		System.out.println("100�� ¥��:"+left/100);
		 left %= 100;
		 System.out.println("50�� ¥��:"+left/50);
		 left %= 50;
		 System.out.println("10�� ¥��:"+left/10);
		 left %= 10;
		 System.out.println("��ȯ �ݾ�:"+(money-left));
		 System.out.println("���� �ݾ�:"+left);
		 
		

	}//end main

}//end class
