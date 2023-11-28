package chapter5;

import java.util.Scanner;

public class StudentApp2 {
	static Scanner sc = new Scanner(System.in);
	static Student [] students = null;
	
	public static void addStuddent() {
		System.out.println("학생 정보 입력:");
		for(int i = 0; i < students.length; i++) {
			Student student = new Student();
			System.out.println("학생 이름 입력:");
			student.name = sc.nextLine();
			System.out.println("남/여 입력:");
			student.gender = sc.nextLine();
			System.out.println("학생 점수 입력:");
			student.score = Integer.parseInt(sc.nextLine());
			students[i] = student; 
			
		}//end of for
	
		
	}//end of addStudent()
	
	public static void searchStudent() {
		System.out.println("조회할 이름 입력:");
		String name = sc.nextLine();
		boolean exists = false;
			for(Student stdn : students) {
				while(name.equals(stdn.name)) {
			System.out.println("이름:"+stdn.name+"의 점수는 "+stdn.score);
			exists = true;
			break;
				}
			}if(!exists) {
				System.out.println("찾는 이름이 없습니다");
		}
	}//end of searchStudent()
	
	public static void analysis() {
		int sumOfMen = 0, cntOfMen = 0;
		int sumOfWomen = 0, cntOfWomen = 0;
		for(Student stn :students) {
			if(stn.gender.equals("남")) {
				sumOfMen += stn.score;
				cntOfMen ++;
			
			}else if(stn.gender.equals("여")) {
				sumOfWomen += stn.score;
				cntOfWomen++;
			}
		}
		System.out.println("남학생의 평균:"+ (sumOfMen / cntOfMen));
		System.out.println("여학생의 평균:"+ (sumOfWomen / cntOfWomen));
	}
	
	public static void modify() {
		//이름 입력 => 변경 점수 
		System.out.println("조회할 이름 입력:");
		String name = sc.nextLine();
		boolean exists = false;
		
//		
//		for(int i = 0; i < students.length; i++) {
//			for stNumCh : students){
//			if(name.equals(stNumCh.name)) {
//				System.out.println(name + "의 변경할 점수를 입력:");
//				int reScore = Integer.parseInt(sc.nextLine());
//				reScore = stNumCh.gender 
//			}
//		}
//		}
		
	}//end of modify()

	public static void main(String[] args) {
		boolean run = true;
		
		int studentNum = 0;
		
		while(run) {
			System.out.println("1.학생수 2.점수입력 3.목록출력 4.분석(최고점수,평균) 5.수정 6.종료");
			int menu = sc.nextInt();  //3. Enter 
			sc.nextLine();
			
			switch(menu) {
			case 1: System.out.println("학생 수 입력:");
			studentNum = Integer.parseInt(sc.nextLine()); // 문자열 "3"을 출력해줌 
			students = new Student [studentNum];
			break;
			case 2: 
				addStuddent();
				break;
			
			case 3: //학생 이름 - 점수 출력 
				searchStudent();
				
				break;
			case 4: //분석
				analysis();
				
			break;
			case 5: 
				modify();
				break;
			case 6: 
				System.out.println("종료합니다");
				run = false;
			}//end of switch
		} //end of while
		
		sc.close();
	}//end main

}//end class