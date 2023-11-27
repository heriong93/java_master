package chapter4;

import java.util.*;

public class Game3 {

	public static void main(String[] args) {
		
		
		int num = (int)(Math.random()*100)+1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력:");
		int guess = sc.nextInt();
		if(num != guess) {
			if(num > guess) {
				System.out.println("down하세요!");
			}if(num < guess) {
				System.out.println("up하세요!");
			}else {
				System.out.println("축하합니다!");
			}
			
		}
		
	}//end main

}//end class
