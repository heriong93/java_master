package remind6;

public class Student {
	String stuNum;
	String stuName;
	int engScore;
	int mathScore;
	
	
	Student(String stuNum, String stuName, int engScore, int mathScore){
		this.stuNum = stuNum;
		this.stuName = stuName;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}
	void showInfo() {
		System.out.println(stuName+"학생의 영어점수는:"+engScore+"이며, 수학점수는"+mathScore+"입니다");
		
}
	//private일때 대체하기 위해 사용. 
	void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}
	void setStuName(String stuName) {
		this.stuName = stuName;
	}
	void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	String getStuNum() {
		return stuNum;
	}
	String getStuName() {
		return stuName;
	}
	int getEngScore() {
		return engScore;
	}
	int getMathScore() {
		return mathScore;
	}
}
