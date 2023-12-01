package chapter7.abstracts;

//추상클래스 
public abstract class Animal {
	private String name;
	
	public Animal() {
		
	}
	public void setName() {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	//추상메소드 
	public abstract void sound(); //다른 메소드 들과 달리 정의하는 부분이 없음. 
	//애니멀 클래스 상속받는 클래스들은 반드시 이 sound()를 불러줘야 에러가 안남 
}
