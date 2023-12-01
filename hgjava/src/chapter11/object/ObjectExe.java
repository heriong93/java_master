package chapter11.object;

public class ObjectExe {
	public static void main(String[] args) {
		// equals

		Object obj1 = new Object();
		Object obj2 = new Object();

		System.out.println(obj1.equals(obj2)); // 객체의 주소값을 비교하는 것. 결과는 항상 false

		String str1 = new String("Hello");
		String str2 = new String("Hello");
		System.out.println(str1.equals(str2)); // string은 안의 문자가 같은지를 비교해줌. 결과는 true

		Member mem1 = new Member("홍길동",22);
		Member mem2 = new Member("홍길동",22);
		System.out.println(mem1.equals(mem2)); // Member 클래스의 
	}
}
