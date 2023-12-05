package remind6;
//저장공간:배열
//추가/수정/삭제/목록/단건 조회

import java.util.ArrayList;
import java.util.List;

import chap13.Member;

public class StudentExe {
	//배열: 
	private Student[] students ;
	
	//생성자 
	StudentExe(){
		
		students = new Student[100];
		students[0]=new Student("23-001","홍길동",77,88);
		students[1]=new Student("23-002","김철수",88,90);
		
	}
	//추가
	boolean addStudent(Student std) {
		for(int i = 0; i< students.length; i++) {
			if(students[i] == null) {
				students[i] = std;
//				break;
				return true;
			}
		}
		return false; //메소드 안에서 return 문은 메소드의 끝.
	}
	
	//목록
	
	Student[] getStudents() {
		return students;
	}
	//단건조회 
	Student getStudent(String no) {
		for(int i = 0; i < students.length;i++) {
			if(students[i] != null && students[i].getStuNum().equals(no)) {
				return students[i];
			}
		}
		return null;
		
	}
	
	//수정
	boolean modifyStudent(String no, int eng, int math) {
		for(int i = 0; i< students.length; i++) {
			if(students[i] != null && students[i].getStuNum().equals(no)) {
				students[i].setEngScore(eng);
				students[i].setMathScore(math);
				return true;
			}
		}
		return false;
	}
	//삭제
	boolean removeStudent(String name) {
		for(int i = 0; i<students.length;i++) {
			if(students[i] != null && students[i].getStuName().equals(name)) {
				students[i] = null;
				return true;
			}
		}
		return false;
		
	}
}
