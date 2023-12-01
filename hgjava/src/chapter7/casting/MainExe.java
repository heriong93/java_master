package chapter7.casting;

public class MainExe {
	public static void main(String[] args) {
		
		double d1 = 100; //정수로 바꾸지 않아도 적용 됨 
		int n1 = (int) 100.0;  //(int) 없이는 변경 안됨 
		// promotion 자동형변환
		Parent p1 =(Parent) new Child(); //(Parent) 쓰지 않아도 자동으로 인식해서 적용해줌
		
		//casting 강제형변환 
//		Child c1 = (Child) new Parent();  //(Child)쓰지 않으면 적용안됨 
		
		//강제형변환: 
		//자식 인스턴스는 강제형변환 ok
		//부모 클래스의 인스턴스를 담고 있으면서 강제형변환하면 ng
		//에러: 컴파일 에러 / 실행에러 
		Parent p2 = new Parent();
		Child c2 = new Child();
		
//		p2 = c2;
		//형 변환 전에 인스턴스 유형 체크 
		if(p2 instanceof Child) {   //자식 클래스가 담겨있는지 확인 
			Child c3 = (Child) p2;  
		}
		
		Child c3 = (Child) p2;
		System.out.println("end of prog.");
		
	}
}
