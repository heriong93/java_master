package chapter7.abstracts;

public class MainExe {
	public static void main(String[] args) {
		Animal animal = null;; //new Animal(); //Animal생성자가 있지만 abstract라서 가져올 수 없음
		animal = new Bird();
	}
}
