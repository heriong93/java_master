package todo1205;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EmpApp {
	public static void main(String [] args) {
		List<Emp> enterprise = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		EmpExe exe = new EmpExe();
		while(run) {
			System.out.println("1-등록 2-목록 3-수정(급여) 4-삭제 5-조회");
			int choice = Integer.parseInt(sc.nextLine());
			switch(choice) {
			case 1: 
				System.out.println("사번 입력:");
				String num = sc.nextLine();
				System.out.println("이름 입력:");
				String name = sc.nextLine();
				System.out.println("전화번호 입력:");
				String phone = sc.nextLine();
				System.out.println("입사일자 입력:");
				String entry = sc.nextLine();
				if(entry == " ") {
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					entry = sdf.format(new Date());
				}
				System.out.println("급여 입력:");
				String pay = sc.nextLine();
				enterprise.add(new Emp(num,name,phone,entry,pay));
				break;
			case 2: 
				System.out.println("사번/"+"\t사원 이름/"+"\t전화번호/"+"\t입사일자/"+"\t급여 ");
				for(Emp emp :enterprise) {
					emp.showInfo();
				}
				break;
			case 3: 
				System.out.println("수정할 사원의 이름 입력:");
				String wkname=sc.nextLine();
				System.out.println("변경할 급여:");
				String wkpay = sc.nextLine();
				if(exe.modifyList(wkname, wkpay)) {
					System.out.println("수정 완료");
				}else {
					System.out.println("수정에 실패하였습니다");
				}
				break;
			case 4: 
				System.out.println("삭제할 사원 입력:");
				String delemp=sc.nextLine();
				if(exe.removeList(delemp)) {
					System.out.println("삭제 완료");
				}else {
					System.out.println("삭제에 실패하였습니다");
				}
				break;
			case 5: 
				System.out.println("조회 이름 입력");
				String nam=sc.nextLine();
				for (int i = 0; i < enterprise.size(); i++) {
					if (enterprise.get(i).getEmpName().equals(nam)) {
						System.out.println("사번"+"\n사원 이름"+"\n전화번호"+"\n입사일자"+"\n급여");
						System.out.println(enterprise.get(i).getEmpNum() + enterprise.get(i).getEmpName()
								+ enterprise.get(i).getEmpPhone()+enterprise.get(i).getEmpDate()+enterprise.get(i).getEmpMoney());
					}
				}
				break;
			}//end of switch
		}//end of while
		System.out.println("end of prog");
		sc.close();
	}//end of main
}//end of class
