package chapter4;

import java.util.*;

public class Game3 {

	public static void main(String[] args) {
		
		
		int num = (int)(Math.random()*100)+1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է�:");
		int guess = sc.nextInt();
		if(num != guess) {
			if(num > guess) {
				System.out.println("down�ϼ���!");
			}if(num < guess) {
				System.out.println("up�ϼ���!");
			}else {
				System.out.println("�����մϴ�!");
			}
			
		}
		
	}//end main

}//end class
