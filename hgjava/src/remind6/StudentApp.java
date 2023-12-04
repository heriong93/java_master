package remind6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import chap13.Member;

public class StudentApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		List<Student> students = new ArrayList<>();
		
		
		
		
		StudentExe exe = new StudentExe();
		while(run) {
			System.out.println("1. 등록 2.목록 3. 단건 조회 4.수정 5.삭제 6.종료 ");
			System.out.println("선택:");
			int choice = Integer.parseInt(sc.nextLine());  //숫자열만 들어갈 수 잇게 
		switch(choice) {
		case 1: 
			System.out.println("학생 번호 입력:");
			String no = sc.nextLine(); 
			System.out.println("학생 이름 입력:");
			String name = sc.nextLine();
			System.out.println("영어 점수 입력:");
			int eng = Integer.parseInt(sc.nextLine());
			System.out.println("수학 점수 입력:");
			int math = Integer.parseInt(sc.nextLine());
			
			Student std = new Student (no, name, eng, math);
			std.add(new Student(no, name,eng,math));
			//students 배열에 한 건 저장 
//			for (int i = 0; i < students.length; i++) {
//				if(students[i] == null) {
//					students[i] = std;
//					break;
//				}
//		}
			if (exe.addStudent(std)) {
			System.out.println("저장되었습니다");
			}else {
				System.out.println("저장 중 오류가 발생했습니다");
			}
			break;
		case 2: //목록보기 
//			for(int i = 0; i< students.length; i++) {
//				if(students[i] != null) {
//					students[i].showInfo();
//				}
//			}
			for(Student stdnt : exe.getStudentList()){
				if(stdnt != null) {
					stdnt.showInfo();
				}
			}//Student[]타입
			break;
		case 3: // 단건 조회
			System.out.println("조회할 학생 번호 입력:");
			no = sc.nextLine();
			Student stnt = exe.getStudent(no);
			if(stnt != null ) {
				stnt.showInfo();
			}else {
				System.out.println("존재하지 않는 정보");
			}
//			for(int i = 0; i<students.length; i++) {
//				if(students[i] != null && students[i].getStuNum().equals(no)) {
//					students[i].showInfo();
//				}
//			}
			break;
		case 4: 
			System.out.println("수정할 학생번호 입력:");
			no = sc.nextLine();
				System.out.println("변경할 수학점수:");
				math = Integer.parseInt(sc.nextLine());
				System.out.print("수정할 영어점수 입력:");
				eng = Integer.parseInt(sc.nextLine());
				if(exe.modifyStudent(no, eng, math)) {
					System.out.println("수정 완료");
			}else {
				System.out.println("수정 실패");
			}
				break;
//			for(int i = 0; i< students.length; i++) {
//				if(students[i] != null && students[i].getStuNum().equals(no)) {
//					System.out.print("변경할 수학점수:");
//					math = Integer.parseInt(sc.nextLine());
//					students[i].setMathScore(math);
//					System.out.print("수정할 영어점수 입력:");
//					eng = Integer.parseInt(sc.nextLine());
//					students[i].setEngScore(eng);
//					students[i].showInfo();
//				}
//			}
		case 5: 
			System.out.println("삭제할 학생의 이름 입력:");
			name = sc.nextLine();
			if(exe.removeStudent(name)) {
				System.out.println("삭제 완료");
			}else {
				System.out.println("삭제 실패");
			}
//			for(int i = 0; i < students.length; i++) {
//				if(students[i] != null && students[i].stuName.equals(name)){
//					students[i]=null;
//				}
//			}
			break;
		case 6: 
			System.out.println("프로그램을 종료합니다");
			run = false;
		
		}//end switch
		}//end while
		System.out.println("end of prog.");
	}

}
