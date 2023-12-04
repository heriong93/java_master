package chapter11.object;

import java.util.Calendar;

public class CalendarExe {
	public static void main(String [] args) {
		//1: YEAR 2: MONTH : DAY_OF_WEEK:일(1)월(2)화(3)...토(7) 값이 정해져있음 
		Calendar cal = Calendar.getInstance();
		cal.set(1,2022);
		cal.set(Calendar.MONTH, 4); //5월
		System.out.println("출력시:"+Calendar.MONTH);
		cal.set(2023, 2,1);
		cal.set(Calendar.DATE, 1); //1일
		System.out.println("년도:" + cal.get(Calendar.DAY_OF_WEEK)); //일주일 중 어느요일인지 알려줌 
		System.out.println("막날:"+cal.getActualMaximum(Calendar.DATE)); //이번달의 마지막 날을 보여줌 
		
	}

}
