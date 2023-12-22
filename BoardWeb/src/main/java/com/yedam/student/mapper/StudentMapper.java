package com.yedam.student.mapper;

import java.util.List;

import com.yedam.student.vo.Student;

public interface StudentMapper {
	//목록,추가,수정,삭제 
	
	//목록
	List<Student> studentList();
	//등록(추가) 
	int addStudent (Student std);  //#{} studentMapper에 설정할때 이렇게 넣음
	//삭제 
	int remStudent(String sno);  //#{sno}로 넣으면 파라미터 바뀜 
}
