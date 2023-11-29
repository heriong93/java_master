package chapter6;
// 회원관리 앱
//회원 번호, 이름, 연락처, 성별 

//public <-> private //클래스 접근 수준을 정하는 것 private은 외부접근을 막아줌 

public class Member {
	//속성(필드) **클래스멤버
	private int membNum; //자바에서는 두 단어 이상의 조합은: CamelCase
	private String memName; 
	private String phone; //010-1234-5456 하이픈 들어가야하니 문자로 선언
	private String gender; // male or female => M,F 로 썼을 경우 

	//생성자 : 필드의 초기값을 지정  **클래스멤버
	//기본 생성자(매개값이 없는것) 컴파일러 생성
	Member(){
		
	}
	Member(int membNum, String memName){
		this.membNum = membNum;
		this.memName = memName;
	}
	
	public Member(int membNum, String memName, String phone, String gender) {
		this.membNum = membNum;
		this.memName = memName;
		this.phone = phone;
		this.gender = gender;
	}
	//기능(메소드) **클래스 멤버
	void showInfo() { //반환하는 값이 없는 것이 void
		System.out.println("이름은 "+ memName +"이고 연락처는 "+phone+"입니다");
	}
	String showAllInfo() {
		String result = "이름은 "+ memName + "번이고 번호는 "+membNum+"이고 연락처는 "+phone + "이고 성별은"+gender+"입니다";
		return result;  //반환하는 값이 있을때 return
	}
	
	//MemberNo 값을 지정하는 메소드 
	
	public void setMembNum(int membNum) {
		this.membNum = membNum;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	//getter. 
	
	 int getMembNum() {
		return membNum;
	}
	String getMemName() {
		return memName;
	}
	String getPhone() {
		return phone;
	}
	String getGender() {
		return gender;
	}
	
}
