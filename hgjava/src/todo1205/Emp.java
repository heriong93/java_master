package todo1205;

public class Emp {
	String empNum; 
	String empName;
	String empPhone;
	String empDate;
	String empMoney;

	Emp(String empNum, String empName, String empPhone, String empDate, String empMoney){
		this.empNum = empNum; 
		this.empName = empName;
		this.empPhone = empPhone;
		this.empDate = empDate;
		this.empMoney = empMoney;
	}
	void showInfo() {
		System.out.println(empNum+"\t"+empName+"\t"+empPhone+"\t"+empDate+"\t"+empMoney);
	}
	public String getEmpNum() {
		return empNum;
	}
	public String getEmpName() {
		return empName;
	}
	public String getEmpPhone() {
		return empPhone;
	}
	public String getEmpDate() {
		return empDate;
	}
	public String getEmpMoney() {
		return empMoney;
	}
	public void setEmpNum(String empNum) {
		this.empNum = empNum;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}
	public void setEmpDate(String empDate) {
		this.empDate = empDate;
	}
	public void setEmpMoney(String empMoney) {
		this.empMoney = empMoney;
	}
	
	
	
}
