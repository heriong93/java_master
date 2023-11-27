package chapter4;

import java.util.*;

public class Game1 {

	public static void main(String[] args) {
		//윤년 계산 프로그램 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("##년도 입력:");
		int year = scanner.nextInt();
		if(year % 4 == 0 && year % 100 != 0) {
		if(year % 400 == 0) {
		}
		System.out.println(year+"년은 윤년입니다");
		}else {
			System.out.println(year+"년은 평년입니다");
		}
	}//end main

}//end class
