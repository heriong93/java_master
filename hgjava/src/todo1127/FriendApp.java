package todo1127;

import java.util.Scanner;

class Friend{
	String name;
	String phoneNum;
	String bloodType;
}

public class FriendApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int friendsNum = 0;
		Friend [] friends = null;
		
		while(run) {
			System.out.println("=============================");
			System.out.println("1.친구 수 2.입력 3.목록 4.수정 5.종료");
			System.out.println("=============================");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println("친구 수 입력:");
			friendsNum = Integer.parseInt(sc.nextLine()); 
			friends = new Friend [friendsNum];
			break;
			case 2: 
				for(int i = 0; i < friends.length; i++) {
					Friend fr = new Friend();
					System.out.println("친구 이름 입력:");
					fr.name = sc.nextLine();
					System.out.println("전화번호 입력:");
					fr.phoneNum = sc.nextLine();
					System.out.println("혈액형 입력:");
					fr.bloodType = sc.nextLine();
					friends[i] = fr; 
						
			}break;
			case 3:
				
				System.out.println("조회할 이름:");
				String searchName = sc.nextLine();
				for(String name :friends.name) {
					if(name.equals(searchName){
					
					
				}
					
				}
				
				
		}
		}
	} // end main

}//end class