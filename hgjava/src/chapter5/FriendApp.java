package chapter5;

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
			System.out.println("1.ģ�� �� 2.�Է� 3.��� 4.���� 5.����");
			System.out.println("=============================");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println("ģ�� �� �Է�:");
			friendsNum = Integer.parseInt(sc.nextLine()); 
			friends = new Friend [friendsNum];
			break;
			case 2: 
				for(int i = 0; i < friends.length; i++) {
					Friend fr = new Friend();
					System.out.println("ģ�� �̸� �Է�:");
					fr.name = sc.nextLine();
					System.out.println("��ȭ��ȣ �Է�:");
					fr.phoneNum = sc.nextLine();
					System.out.println("������ �Է�:");
					fr.bloodType = sc.nextLine();
					friends[i] = fr; 
						
			}break;
			case 3:
				
				System.out.println("��ȸ�� �̸�:");
				String searchName = sc.nextLine();
				for(String name :friends.name) {
					if(name.equals(searchName){
					
					
				}
					
				}
				
				
		}
		}
	} // end main

}//end class
