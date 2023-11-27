package chapter3;

import java.util.*;

public class Exam128 {

	public static void main(String[] args) {
		//문제 4번
		int pencils = 534; 
		int students = 30;
		
		//학생 1명이 가지는 연필 개수
		int pencilsPerStudent = pencils / students;
		int remPencils = pencils % students;
		System.out.printf("학생당 연필 수 :%d,남은 연필 수 : %d, \n",pencilsPerStudent,remPencils);
		
		//문제 5번
		int var1 = 5;
		int var2 = 2;
		double var3 = (double)var1 / var2;
		int var4 = (int) (var3 * var2);
		System.out.println(var4);
		
		//문제 6번 
		int value = 365;
		System.out.println(value/100*100);
		
		//문제 7번
		
		float var10 = 10f;
		float var20 = var10 / 100;
		if(var20 == (float)0.1) {
			System.out.println("10%입니다");
		}else {
			System.out.println("10%가 아닙니다");
		}
		
		//문제 8번
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
//		double area = (double)(lengthTop + lengthBottom)*height/2; 두가지 방법 다 사용 가능 
		double area = (lengthTop + lengthBottom)*height/2.0;
		System.out.println(area);
		
		//문제9번
//		Scanner sc = new Scanner (System.in);
//		System.out.print("첫번째 수: ");
//		double num1 = sc.nextDouble();
//		
//		System.out.println("두번째 수: ");
//		double num2 = sc.nextDouble();
//		
//		if(num2 == 0){
//			System.out.println("결과: 무한대");
//		}else {
//			System.out.println("결과: " +( num1 / num2));
//		}
//		sc.close();
		
		//10번
		int var100 = 10;
		int var200 = 3;
		int var300 = 14;
		double var400 = var100  * var100 * Double.parseDouble(var200 +"." + var300);
		System.out.println("원의 넓이:" + var400);
		
		//11번 문제 
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("아이디: ");
		String name = scanner.nextLine();
		
		System.out.println("패스워드: ");
		String strPassword = scanner.nextLine();
		int password = Integer.parseInt(strPassword);
		if(name.equals("java")) {
			if(password == 12345) {
				System.out.println("로그인 성공: ");
			}else {
				System.out.println("로그인 실패:패스워드가 틀림");
			}
		}else {
			System.out.println("로그인 실패: 아이디가 존재하지 않음");
		}
		
		
	//12번 문제 
		
		int x = 10;
		int y = 5;
		System.out.println("(x>7) && (y<=5)의 값은: " + (x>7 && (y<=5))+"입니다");
		System.out.println("(x%3 == 2 || (y%2 != 1) 의 값은" +(x%3 == 2 || (y%2 != 1)) + "입니다");
		
		
		
		

	} // end main

} //end class
