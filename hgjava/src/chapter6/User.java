package chapter6;

public class User {
	private String userId; 
	private String passwd;
	private String userName;
//생성자 
	public User(String userId, String passwd, String userName) {
		this.userId = userId;
		this.passwd = passwd;
		this.userName = userName;
	}
	//getter  -> 안에 값을 리턴시켜주는 것  
	public String getUserId() {
		return userId;
	}
	public String getPasswd() {
		return passwd;
	}
	public String getUserName() {
		return userName;
	}
	
}
