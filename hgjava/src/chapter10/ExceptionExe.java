package chapter10;

public class ExceptionExe {
	public static void main(String[] args) {
		try {
			test();
//			Class.forName("java.lang.String");  //이렇게 찾아내거나 아래의 방법으로 해결 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("end of program");
	}

	public static void test() throws ClassNotFoundException{  //두가지 방법 가능 
		//일반예외: 예외를 처리해줘야만 실행이 된다 
				Class.forName("java.lag.String");
	}
}
