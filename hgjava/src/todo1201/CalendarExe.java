package todo1201;

import java.util.Calendar;

public class CalendarExe {
	public static void main(String[] args) {
		//12월 달력 작성하기 
		//1일이 금요일로 시작하려면 빈 공백을 처음에 5개 만들어줘야함 
		int year = 2023;
		int month = 12; 
		System.out.println(year+"년"+month+"월");
		Calendar today = Calendar.getInstance();
		//10월 달력 작성
		today.set(Calendar.YEAR, year);
		today.set(Calendar.MONTH, month-1);  //컴퓨터는 0에서 시작하기때문에 -1 
		today.set(Calendar.DATE,1);
		
	
		String [] days = {"Sun","Mon","Tue","Wed","Thr","Fri","Sat"};
		for(String day : days) {
			System.out.printf("%4s",day);
		}
		System.out.println();
		//빈공백 생성 
		int spaces = today.get(Calendar.DAY_OF_WEEK);
		for(int i = 0; i <spaces-1 ; i++) { //day_of_week = 어느요일인지 알려줌/ -1하는 이유는 요일 앞에만 공백을 만들어줘야하기 때문 
			System.out.printf("%4s","");
		}
		int lastDay = today.getActualMaximum(Calendar.DATE);
		for(int i = 1; i <= lastDay ; i++) {  //달의 마지막 날짜를 출력해줌 
				System.out.printf("%4d",i);
			if((i+today.get(Calendar.DAY_OF_WEEK)-1) % 7 == 0 ) {
				System.out.println();
			}
		}
		System.out.println("\n===========the end===========");
	}//end of main
}//end of class
