package chapter7;

import java.util.Scanner;

public class FriendApp {
	static Scanner sc = new Scanner(System.in);
	static Friend[] storage = new Friend[10]; //인스턴스 10개 담을 수 잇는 공간 생성 
	public static void main(String[]args) {
		boolean run = true;
		while(run) {
			System.out.println("1.등록 2.목록 3.조회 4.종료");
			int menu = Integer.parseInt(sc.nextLine());
			switch(menu) {
			case 1 : //등록
				addFriend(); //addFriend()메소드 호출 
				break;
			case 2: // 목록
				friendList(); 
				break;
			case 3: //상세보기 
				getFriend(); 
				break;
			default:
				System.out.println("종료합니다");
				run = false;
			}
		}
	}//end of main
	
	private static void addFriend() {
		System.out.println("1.친구 2.학교 3.회사");
		int subMenu = Integer.parseInt(sc.nextLine());
		
		Friend friend = null; //
		
		//case 1: //이름, 연락처
		System.out.println("이름:");
		String name = sc.nextLine();
		System.out.println("연락처:");
		String phone = sc.nextLine();
		
		if(subMenu == 1) { 
			friend = new Friend(name, phone);
			
			//Friend 인스턴스 friend 에 새로운 name phone 정보를 넣을거야
		}else if(subMenu == 2) {   //case 2: //이름, 연락처, 학교, 전공
			System.out.println("학교:");
			String univ = sc.nextLine();
			System.out.println("전공:");
			String major = sc.nextLine();
			friend = new UnivFriend(name,phone,univ,major);
			
			
		}else if(subMenu ==3) { //case 3: //이름, 연락처, 회사 이름, 부서 이름
			System.out.println("회사:");
			String comp = sc.nextLine();
			System.out.println("부서:");
			String dept = sc.nextLine();
			friend = new CompFriend(name,phone,comp,dept);
			
		}
		//배열에 추가
		for(int i = 0; i < storage.length; i++) {
			if( storage[i] == null) {
				storage[i] = friend;
				break;
			}
		}System.out.println("저장완료");
		
	}//등록하기 위한 메소드 
	private static void friendList() {
		for(Friend fnd : storage) {
			if(fnd != null) {
				System.out.println(fnd.showInfo());
			}
		}
	}//목록
	private static void getFriend() {
		System.out.println("1.이름 2.연락처");
		int subMenu = Integer.parseInt(sc.nextLine());
		String searchCond = "";
		if(subMenu ==1) {
			searchCond = sc.nextLine();
			for(Friend fnd : storage) {
				if(fnd != null && fnd.getName().equals(searchCond)) {
					System.out.println(fnd.showInfo());
				}
			}
		}else if(subMenu ==2) {
			searchCond = sc.nextLine();
			for(Friend fnd : storage) {
				if(fnd != null && fnd.getPhone().equals(searchCond)) {
					System.out.println(fnd.showInfo());
				}
			}
		}else {
			System.out.println("1 또는 2 선택하세요");
		}
	}//단건조회
	void backup() {
		Object obj = new Object();
		obj.equals(obj);
		
		Friend parent = new Friend();
		parent.setName("홍길동");
		parent.setPhone("010-1234-5678");
		System.out.println(parent.toString());
		
		UnivFriend child = new UnivFriend();
		child.setName("김철수");
		child.setPhone("010-1212-1212");
		child.setUniv("구미대학교");
		child.setMajor("컴퓨터공학과");
		System.out.println(child.showInfo());
		
		Friend[] friends = new Friend[10];
		friends[0] = parent;
		friends[1] = child;
	}
	
}//end of class
