package chapter1;

import java.util.Scanner;

public class Exam98 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1번
		String name = "감바자";
		int age = 25;
		String tel1 = "010", tel2 = "123", tel3 = "4567";
		System.out.println("이름: "+ name);
		System.out.print("나이: "+ age +"\n");
		System.out.printf("전화: %s-%s-%s ",tel1,tel2,tel3);
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("\n"+"첫번째 수:");
		String strNum1 = scanner.nextLine();
		
		System.out.print("두번째 수:");
		String strNum2 = scanner.nextLine();
		
		int num1 = Integer.parseInt (strNum1) ;
		int num2 = Integer.parseInt (strNum2) ;
		int result = num1 +num2;
		System.out.println("덧셈 결과:" + result +"\n");
		
		
		System.out.print("이름:");
		String strName = scanner.nextLine();
			
		System.out.print("주민번호 앞 6자리:");
		String strNumber = scanner.nextLine();
		
		System.out.print("전화번호:");
		String strTel = scanner.nextLine();
		
		System.out.print(strName +"\n"+ strNumber + "\n" + strTel);
		
		
		
		
		
		

	} //end main

} //end class
