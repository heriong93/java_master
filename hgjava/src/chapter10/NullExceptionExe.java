package chapter10;

public class NullExceptionExe {
	public static void main(String[] args) {
		//Null 값을 참조할 경우 [주의] 
		
		String name = "Hong";
		name = null;
		String menu = "2";
		
		//예외처리 
		try {
			name = "";
			System.out.println(name.toString()); // null 값이 지정되어있을 때 출력 에러 -> try,catch로 
			int num = Integer.parseInt(menu);
			System.out.println("입력값은"+num);
		
		}catch(NullPointerException |NumberFormatException e){  //e 와 ne와 같은 아이들은 변수 
			System.out.println("Null 예외 발생"); // try-> 를 실행했을 때 catch(여기와 같은 내용이 일어나면) =결과물
//			e.printStackTrace();   //예외가 어디서 발생하는지 알려주는 기능 e.변수 활용해서 사용하기 위해 에러명에 변수 만들어줌
//		}catch(NumberFormatException ne) {  // 위 처럼 하나로 합칠 수도 있다 
//			System.out.println("숫자값을 입력하세요");
		}catch(Exception ee) {        //위의 에러 외  알 수 없는 에러들은 다음을 실행
			System.out.println("알수 없는 예외가 발생했습니다");
		}
		
		System.out.println("end of prog");
	}
}
