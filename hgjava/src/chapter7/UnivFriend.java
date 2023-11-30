package chapter7;
//자식의 역할 : 부모의 특징을 물려받음 UnivFriend -> Friend(부모)
import lombok.Data;
@Data   //get set method 대신 생성해주는 lombok 
public class UnivFriend extends Friend{
	private String univ; //학과
	private String major;  //전공
	
	public UnivFriend() {
	}
	
	public UnivFriend(String name, String phone, String univ, String major) {
		super(name,phone);  //부모 클래스가 가지고 있는 메소드 의미 
		this.univ = univ;
		this.major = major;
	}
	
	@Override
	public String showInfo() {
		
		return "이름은:" + super.getName()+" 연락처는:" + getPhone()+ " 학교는:"+univ+" 전공은:"+major;
	}
	
	public String getUniv() {
		return univ;
	}
	public void setUniv(String univ) {
		this.univ = univ;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
}
