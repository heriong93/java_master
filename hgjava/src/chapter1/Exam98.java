package chapter1;

import java.util.Scanner;

public class Exam98 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1��
		String name = "������";
		int age = 25;
		String tel1 = "010", tel2 = "123", tel3 = "4567";
		System.out.println("�̸�: "+ name);
		System.out.print("����: "+ age +"\n");
		System.out.printf("��ȭ: %s-%s-%s ",tel1,tel2,tel3);
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("\n"+"ù��° ��:");
		String strNum1 = scanner.nextLine();
		
		System.out.print("�ι�° ��:");
		String strNum2 = scanner.nextLine();
		
		int num1 = Integer.parseInt (strNum1) ;
		int num2 = Integer.parseInt (strNum2) ;
		int result = num1 +num2;
		System.out.println("���� ���:" + result +"\n");
		
		
		System.out.print("�̸�:");
		String strName = scanner.nextLine();
			
		System.out.print("�ֹι�ȣ �� 6�ڸ�:");
		String strNumber = scanner.nextLine();
		
		System.out.print("��ȭ��ȣ:");
		String strTel = scanner.nextLine();
		
		System.out.print(strName +"\n"+ strNumber + "\n" + strTel);
		
		
		
		
		
		

	} //end main

} //end class
