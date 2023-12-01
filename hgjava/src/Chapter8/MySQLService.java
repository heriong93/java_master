package Chapter8;

//상속: extends 부모 클래스 
//구현: implements 인터페이스
public class MySQLService implements DatabaseService{

	public void add() {
		System.out.println("MySQLS 입력처리");
	}

	public void modify() {
		System.out.println("mySQL 수정처리");
	}

	public void remove() {
		System.out.println("mySQL 삭제처리");
	}
	
}
