package chapter4;

public class Exam140 {

	public static void main(String[] args) {
		//�ֻ��� ��ȣ �̱� 
		int num = (int)(Math.random() * 6) +1;
		if(num == 1) {
			System.out.println("1���Դϴ�");
		}else if(num == 2) {
			System.out.println("2���Դϴ�");
		}else if(num == 3) {
			System.out.println("3���Դϴ�");
		}else if(num == 4) {
			System.out.println("4���Դϴ�");
		}else if(num == 5) {
			System.out.println("5���Դϴ�");
		}else {
			System.out.println("6���Դϴ�");
		}
		
		//switch
		switch(num) {
		case 1: System.out.println("s1���Դϴ�"); break;
		case 2: System.out.println("s2���Դϴ�"); break;
		case 3: System.out.println("s3���Դϴ�"); break;
		case 4: System.out.println("s4���Դϴ�"); break;
		case 5: System.out.println("s5���Դϴ�"); break;
		default: System.out.println("s6���Դϴ�"); break;
		}
		

	}//end main

}//end class
