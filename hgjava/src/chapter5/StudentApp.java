package chapter5;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int stuNum = 0;
		int [] scores = null;
		String[] names = null;
		boolean run = true;
		while(run) {
			System.out.println("1.�л��� 2.�����Է� 3.������ 4.�м�(�ְ�����,���) 5.����");
			int menu = sc.nextInt();  //3. Enter 
			sc.nextLine();
			
			switch(menu) {
			case 1: System.out.println("�л� �� �Է�:");
			stuNum = sc.nextInt();
			scores = new int [stuNum];
			names = new String[stuNum];
			break;
			case 2: System.out.println("���� �Է�:");
			//for �ݺ�
			for (int i = 0; i < scores.length; i++) {
				System.out.println("names [" + i + "]");
				names[i] = sc.nextLine();
				System.out.println("scores["+ i +"]");
				scores[i] = sc.nextInt();
				sc.nextLine();
			}
			break;
			case 3: System.out.println("��� ���:");
			for (int i = 0; i < scores.length; i++) {
				System.out.println("�̸���" + names[i] +"������"+scores[i]+"\n");
			}
			break;
			case 4: System.out.println("�м�:");
			int maxNum = 0;
			double avg = 0; 
			int sumAvg = 0;
			String maxName = "";
			
//			for(int num : scores) {
			for(int i = 0; i < scores.length; i++) {
				sumAvg += scores[i];
				if(maxNum < scores[i] ) {
					maxNum = scores[i];
					maxName = names [i];
				}
			}
				avg = sumAvg*1.0 / scores.length;
				System.out.println("�л��̸�:"+maxName);
			System.out.println("max��:"+ maxNum);
			System.out.println("��հ�:"+ avg);
				
				break;
			case 5: System.out.println("����");
			run = false; break;
			
			}// end of switch 
		}//end of while 
		System.out.println("end of program");
		
		
	}//end main

}//end class
