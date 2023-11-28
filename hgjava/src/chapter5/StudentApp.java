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
			System.out.println("1.학생수 2.점수입력 3.목록출력 4.분석(최고점수,평균) 5.종료");
			int menu = sc.nextInt();  //3. Enter 
			sc.nextLine();
			
			switch(menu) {
			case 1: System.out.println("학생 수 입력:");
			stuNum = sc.nextInt();
			scores = new int [stuNum];
			names = new String[stuNum];
			break;
			case 2: System.out.println("점수 입력:");
			//for 반복
			for (int i = 0; i < scores.length; i++) {
				System.out.println("names [" + i + "]");
				names[i] = sc.nextLine();
				System.out.println("scores["+ i +"]");
				scores[i] = sc.nextInt();
				sc.nextLine();
			}
			break;
			case 3: System.out.println("목록 출력:");
			for (int i = 0; i < scores.length; i++) {
				System.out.println("이름은" + names[i] +"점수는"+scores[i]+"\n");
			}
			break;
			case 4: System.out.println("분석:");
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
				System.out.println("학생이름:"+maxName);
			System.out.println("max값:"+ maxNum);
			System.out.println("평균값:"+ avg);
				
				break;
			case 5: System.out.println("종료");
			run = false; break;
			
			}// end of switch 
		}//end of while 
		System.out.println("end of program");
		
		
	}//end main

}//end class