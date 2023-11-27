package chapter5;

import java.util.Scanner;

public class StudentApp2 {
	static Scanner sc = new Scanner(System.in);
	static Student [] students = null;
	
	public static void addStuddent() {
		System.out.println("�л� ���� �Է�:");
		for(int i = 0; i < students.length; i++) {
			Student student = new Student();
			System.out.println("�л� �̸� �Է�:");
			student.name = sc.nextLine();
			System.out.println("��/�� �Է�:");
			student.gender = sc.nextLine();
			System.out.println("�л� ���� �Է�:");
			student.score = Integer.parseInt(sc.nextLine());
			students[i] = student; 
			
		}//end of for
	
		
	}//end of addStudent()
	
	public static void searchStudent() {
		System.out.println("��ȸ�� �̸� �Է�:");
		String name = sc.nextLine();
		boolean exists = false;
			for(Student stdn : students) {
				while(name.equals(stdn.name)) {
			System.out.println("�̸�:"+stdn.name+"�� ������ "+stdn.score);
			exists = true;
			break;
				}
			}if(!exists) {
				System.out.println("ã�� �̸��� �����ϴ�");
		}
	}//end of searchStudent()
	
	public static void analysis() {
		int sumOfMen = 0, cntOfMen = 0;
		int sumOfWomen = 0, cntOfWomen = 0;
		for(Student stn :students) {
			if(stn.gender.equals("��")) {
				sumOfMen += stn.score;
				cntOfMen ++;
			
			}else if(stn.gender.equals("��")) {
				sumOfWomen += stn.score;
				cntOfWomen++;
			}
		}
		System.out.println("���л��� ���:"+ (sumOfMen / cntOfMen));
		System.out.println("���л��� ���:"+ (sumOfWomen / cntOfWomen));
	}
	
	public static void modify() {
		//�̸� �Է� => ���� ���� 
		System.out.println("��ȸ�� �̸� �Է�:");
		String name = sc.nextLine();
		boolean exists = false;
		
//		
//		for(int i = 0; i < students.length; i++) {
//			for stNumCh : students){
//			if(name.equals(stNumCh.name)) {
//				System.out.println(name + "�� ������ ������ �Է�:");
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
			System.out.println("1.�л��� 2.�����Է� 3.������ 4.�м�(�ְ�����,���) 5.���� 6.����");
			int menu = sc.nextInt();  //3. Enter 
			sc.nextLine();
			
			switch(menu) {
			case 1: System.out.println("�л� �� �Է�:");
			studentNum = Integer.parseInt(sc.nextLine()); // ���ڿ� "3"�� ������� 
			students = new Student [studentNum];
			break;
			case 2: 
				addStuddent();
				break;
			
			case 3: //�л� �̸� - ���� ��� 
				searchStudent();
				
				break;
			case 4: //�м�
				analysis();
				
			break;
			case 5: 
				modify();
				break;
			case 6: 
				System.out.println("�����մϴ�");
				run = false;
			}//end of switch
		} //end of while
		
		sc.close();
	}//end main

}//end class
