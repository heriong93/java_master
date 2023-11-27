package chapter5;

//복합적인 형태의 데이터 구조 
class Friend{
	
	String name; //필드
	int age; //필드
	double height; //필드 
	
	
}
public class ReferenceExe1 {

	public static void main(String[] args) {
		
		//참조변수: 실제 값을 담는것이 아니라 -> 실제 값의 주소를 담고 있다.
		Friend myFriend = new Friend(); //new => 객체 생성.
		myFriend.name = "김철수";
		myFriend.age = 20 ;
		myFriend.height = 178.3;
		
//		Friend ourFriend = myFriend;
//		System.out.println(ourFriend.name);
//		System.out.println(ourFriend.age);
//		System.out.println(ourFriend.height);
//		myFriend.name = "홍길동";
		
		Friend yourFriend = new Friend(); //new -> 객체 생성
		yourFriend.name = "김철수";
		yourFriend.age = 20;
		yourFriend.height = 178.3;
		System.out.println(myFriend == yourFriend); //주소값 비교: false. 값이 없기 때문 
		
		yourFriend = null;
		System.out.println(myFriend.name);
		try {
			System.out.println(yourFriend.name);
		}catch(Exception e) {
			System.out.println("null값을 참조합니다");
		}
		
		//기본 타입
		int a = 10;
		int b = a;
		
		a = 20;
		
		
		//참조 타입은 : 주소 값을 변수에 저장. 
		String name = "신용권";  //23dbdae34334 16진수의 이름으로 값을 가지고 있음-> 신용권이라는 객체에 값을 저장해놓음
		String hobby = "독서";
		
		String name1 = "신용권";
		System.out.println("name"+name);
		System.out.println("name1"+name1);
		
		System.out.println(name == name1); // == -> equals메소드 활용해야한다.
		
		
		
		
	}//end main

}//end class
