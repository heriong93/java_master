package chapter11.object;

public class Member {
	private String name;
	private int age;
	
	Member(String name, int age){
		this.name = name;
		this.age = age;
	}
	//equals
	@Override
	public boolean equals(Object obj) { // Member객체 비교 용 if문
		//논리적으로 동등한 객체(이름,나이)
		if(obj instanceof Member) {
			Member target = (Member) obj;
			if(this.name.equals(target.name) &&
			this.age == target.age) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		return this.name.hashCode(); //.hashcode -> 문자가 똑같으면 같은 값으로 반환해줌 
	}
	@Override
	public String toString() {  //toString이 없으면 결과창 주소값만 찍힘 
		return "Member [name=" + name + ", age=" + age + "]";
	}
	
}
