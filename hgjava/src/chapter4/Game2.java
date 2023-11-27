package chapter4;

import java.util.Scanner;

public class Game2 {

	public static void main(String[] args) {
		//동전 교환
		Scanner sc = new Scanner(System.in);
		System.out.print("##교환할 금액:");
		int money = sc.nextInt();
		
		
		System.out.println("500원 짜리:"+money/500);
		int left = money % 500;
		System.out.println("100원 짜리:"+left/100);
		 left %= 100;
		 System.out.println("50원 짜리:"+left/50);
		 left %= 50;
		 System.out.println("10원 짜리:"+left/10);
		 left %= 10;
		 System.out.println("교환 금액:"+(money-left));
		 System.out.println("남은 금액:"+left);
		 
		

	}//end main

}//end class
