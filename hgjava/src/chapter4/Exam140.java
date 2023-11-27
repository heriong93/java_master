package chapter4;

public class Exam140 {

	public static void main(String[] args) {
		//주사위 번호 뽑기 
		int num = (int)(Math.random() * 6) +1;
		if(num == 1) {
			System.out.println("1번입니다");
		}else if(num == 2) {
			System.out.println("2번입니다");
		}else if(num == 3) {
			System.out.println("3번입니다");
		}else if(num == 4) {
			System.out.println("4번입니다");
		}else if(num == 5) {
			System.out.println("5번입니다");
		}else {
			System.out.println("6번입니다");
		}
		
		//switch
		switch(num) {
		case 1: System.out.println("s1번입니다"); break;
		case 2: System.out.println("s2번입니다"); break;
		case 3: System.out.println("s3번입니다"); break;
		case 4: System.out.println("s4번입니다"); break;
		case 5: System.out.println("s5번입니다"); break;
		default: System.out.println("s6번입니다"); break;
		}
		

	}//end main

}//end class
