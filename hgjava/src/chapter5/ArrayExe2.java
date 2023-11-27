package chapter5;

public class ArrayExe2 {

	public static void main(String[] args) {
		
		//정수를 담을 수 있는 배열을 생성(크기는 10개의 정수를 저장).
		int [] intAry = new int [10];
		//변수 이름은 intAry => 10~100 담아 저장 
		for(int i = 0 ; i < intAry.length; i++) {  //다 적으면 어려우니 이렇게 for 문 사용
			intAry[i] = (i + 1) *10; 
		}
//		intAry[0] = 10;
//		intAry[1] = 20;
//		intAry[2] = 30;
//		intAry[3] = 40;
//		intAry[4] = 50;
//		intAry[5] = 60;
//		intAry[6] = 70;
//		intAry[7] = 80;
//		intAry[8] = 90;
//		intAry[9] = 100;
		
		//출력
		
		int sum = 0;    //50보다 큰 수를 저장
		double avg = 0;
		int count = 0;
		for (int num : intAry) {
			System.out.println(num);         //다른 방법
			if(num >50) {
				sum += num;
				count ++;   //50보다 큰 수의 평균을 구하기 위해 50이 넘을때마다 1++증가 
			}
		}
		avg = sum / count;
		System.out.println("50보다 큰 수의 합계"+ sum);
		System.out.println("50보다 큰 수의 평균"+ (avg));  
			
////		for(int i = 0; i <intAry.length; i++) {
////			System.out.println(intAry[i]);
////			
//		}
//		
		

	}//end main

}//end class
