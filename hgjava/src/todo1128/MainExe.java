package todo1128;

public class MainExe {
	public static void main(String[] args) {
		BoardApp app = BoardApp.getInstance();
		BoardApp app1 = BoardApp.getInstance();
		System.out.println(app == app1);
		app.start();
		
		final int num = 10;   //final 붙이면 값을 그 이후에 변경할 수 없음 
//		num = 20;             //그 뒤로 수정되는 내용은 에러남 
	}
}
