package chapter4;

import java.util.*;

public class Game1 {

	public static void main(String[] args) {
		//���� ��� ���α׷� 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("##�⵵ �Է�:");
		int year = scanner.nextInt();
		if(year % 4 == 0 && year % 100 != 0) {
		if(year % 400 == 0) {
		}
		System.out.println(year+"���� �����Դϴ�");
		}else {
			System.out.println(year+"���� ����Դϴ�");
		}
	}//end main

}//end class
