package Chapter8;

//추상 클래스처럼 추상 메소드만 정리할 수 있다. 
//Oracle : insert(), update(), / MySQL :add(),modify(),/ 
//
public interface DatabaseService {
	public static final String name = ""; //상수 선언만 가능 
	//메소드: 입력, 수정, 삭제등의 기능을 무엇으로 사용할지 정하기
	public void add();
	public void modify();
	public void remove();
}
