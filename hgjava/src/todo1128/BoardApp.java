package todo1128;

import java.util.Scanner;

public class BoardApp {

	public static void main(String[] args) {
		Board [] boards = new Board [100];
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		while(run) {
			System.out.println("1.등록 2. 목록 3. 상세조회 4. 종료 ");
			System.out.println("-----------------------------");
			int choice = Integer.parseInt(sc.nextLine());
			switch(choice) {
			case 1:
				break;
			case 2: 
				break;
			case 3: 
				break;
			case 4: 
				break;
			}
		}
		
	}

}
