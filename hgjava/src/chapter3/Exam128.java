package chapter3;

import java.util.*;

public class Exam128 {

	public static void main(String[] args) {
		//���� 4��
		int pencils = 534; 
		int students = 30;
		
		//�л� 1���� ������ ���� ����
		int pencilsPerStudent = pencils / students;
		int remPencils = pencils % students;
		System.out.printf("�л��� ���� �� :%d,���� ���� �� : %d, \n",pencilsPerStudent,remPencils);
		
		//���� 5��
		int var1 = 5;
		int var2 = 2;
		double var3 = (double)var1 / var2;
		int var4 = (int) (var3 * var2);
		System.out.println(var4);
		
		//���� 6�� 
		int value = 365;
		System.out.println(value/100*100);
		
		//���� 7��
		
		float var10 = 10f;
		float var20 = var10 / 100;
		if(var20 == (float)0.1) {
			System.out.println("10%�Դϴ�");
		}else {
			System.out.println("10%�� �ƴմϴ�");
		}
		
		//���� 8��
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
//		double area = (double)(lengthTop + lengthBottom)*height/2; �ΰ��� ��� �� ��� ���� 
		double area = (lengthTop + lengthBottom)*height/2.0;
		System.out.println(area);
		
		//����9��
//		Scanner sc = new Scanner (System.in);
//		System.out.print("ù��° ��: ");
//		double num1 = sc.nextDouble();
//		
//		System.out.println("�ι�° ��: ");
//		double num2 = sc.nextDouble();
//		
//		if(num2 == 0){
//			System.out.println("���: ���Ѵ�");
//		}else {
//			System.out.println("���: " +( num1 / num2));
//		}
//		sc.close();
		
		//10��
		int var100 = 10;
		int var200 = 3;
		int var300 = 14;
		double var400 = var100  * var100 * Double.parseDouble(var200 +"." + var300);
		System.out.println("���� ����:" + var400);
		
		//11�� ���� 
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���̵�: ");
		String name = scanner.nextLine();
		
		System.out.println("�н�����: ");
		String strPassword = scanner.nextLine();
		int password = Integer.parseInt(strPassword);
		if(name.equals("java")) {
			if(password == 12345) {
				System.out.println("�α��� ����: ");
			}else {
				System.out.println("�α��� ����:�н����尡 Ʋ��");
			}
		}else {
			System.out.println("�α��� ����: ���̵� �������� ����");
		}
		
		
	//12�� ���� 
		
		int x = 10;
		int y = 5;
		System.out.println("(x>7) && (y<=5)�� ����: " + (x>7 && (y<=5))+"�Դϴ�");
		System.out.println("(x%3 == 2 || (y%2 != 1) �� ����" +(x%3 == 2 || (y%2 != 1)) + "�Դϴ�");
		
		
		
		

	} // end main

} //end class
