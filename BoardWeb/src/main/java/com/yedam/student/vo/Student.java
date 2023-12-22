package com.yedam.student.vo;

public class Student {
	String stuNum;
	String stuName;
	int engScore;
	int mathScore;
	
	public Student(){

	}
	
	public Student(String stuNum, String stuName, int engScore, int mathScore){
		this.stuNum = stuNum; //stu_num
		this.stuName = stuName;//stu_name
		this.engScore = engScore;//eng_score
		this.mathScore = mathScore; //math_score 
	}
	
	public void showInfo() {
		System.out.println(stuName+"학생의 영어점수는:"+engScore+"이며, 수학점수는"+mathScore+"입니다");
		
}
	//private일때 대체하기 위해 사용. 
	
	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	public String getStuNum() {
		return stuNum;
	}
	public String getStuName() {
		return stuName;
	}
	public int getEngScore() {
		return engScore;
	}
	public int getMathScore() {
		return mathScore;
	}
}
