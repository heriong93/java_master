package chapter7.casting;

public class Child extends Parent {
	private String phone;
	
	@Override
	String showInfo() {
		return super.showInfo()+" - "+ phone;    //부모의 속성을 끌고와 + 자식의 속성 추가
	}
}
