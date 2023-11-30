package chapter7;
//CompFriend,UnivFriend ->  다 인스턴스를 위해 만든 클래스 (데이터 담아놓기 위한 클래스)
//Friend 상속 + 회사, 부서 
public class CompFriend extends Friend {
	private String company; //회사 
	private String dept;  //부서 
	
	public CompFriend (String name, String phone, String company,String dept) {
		super(name,phone);  //부모 클래스를 가리킴 
		this.company = company;
		this.dept = dept;
	}
	
	@Override
	public String showInfo() {
		return "이름은: "+super.getName()+"연락처는: "+super.getPhone()+"회사는: "+company+"부서는: "+dept;
	}
	//getter, setter 
	public String getCompany() {
		return company;
	}
	public String getDept() {
		return dept;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
}
