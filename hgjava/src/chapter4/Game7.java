package chapter4;

public class Game7 {

	public static void main(String[] args) {
		//7번 게임 =  3,6,9게임
		//1~50 : 369게임
		
		//3,6,9 갯수 체크 변수
		int count = 0;
		
		//숫자 1~50 반복문 
		for(int i = 1; i<=50; i++) {
			count = 0;
			//일의 자리에 3,6,9 있는지 갯수를 체크 
		if( i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				count ++;
			}
			int ten = (int)(i/10);
			//십의 자리에 3,6,9 있는지 갯수를 체크 
			if(ten == 3 || ten == 6 || ten == 9){
				count ++;
			}
			switch(count) {
			//갯수가 0 -> 숫자
			case 0:System.out.print(i+"\t");break;
			//갯수가 1 -> ♥
			case 1:System.out.print("♥\t"); break;
			//갯수가 2 -> ♥♥
			case 2:System.out.print("♥♥\t");
			}
			if(i%10 == 0) {
				System.out.println();
			}
		}
		
		

	}//end main

} // end class
