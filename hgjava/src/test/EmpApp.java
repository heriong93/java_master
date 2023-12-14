package test;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;



public class EmpApp {
public static void main (String[]args) {
	
		Scanner sc= new Scanner (System.in);
		boolean run = true;
		EmpDAO ex = new EmpDAO();
		
		while(run) {
			System.out.println("1.등록 2.목록 3.수정(급여) 4.삭제 5.조회(조건:입사일자) 6.종료");
			int choice = Integer.parseInt(sc.nextLine());
			switch(choice) {
			case 1:
				System.out.print("사번입력>>");
				String num = sc.nextLine();
				System.out.print("이름입력>>");
				String name = sc.nextLine();
				System.out.print("전화번호입력>>");
				String phone = sc.nextLine();
				System.out.print("입사일입력>>");
				String entry = sc.nextLine();
				if(entry == " ") {
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					entry = sdf.format(new Date());
				}
				System.out.print("급여입력>>");
				String pay =sc.nextLine();
				List<Emp> enter = new ArrayList<>();
				enter.add(new Emp(num,name,phone,entry,pay));
				System.out.println("등록되었습니다.");
				break;
			case 2:
				System.out.println("사번"+ "\t 이름" + "\t 전화번호");
				for(Employee emp : enter) {
					emp.showBasicInfo();
				}
				break;
			case 3:
				System.out.println("사번 급여>>");
				String input =sc.nextLine(); 
				String [] inpAry = input.split(" ");
				String order = inpAry[0]; //사번
				String title = inpAry[1]; //급여
				ex.modifyPay(order, title);
				break;
			case 4:
				System.out.println("사번:");
				String delemp=sc.nextLine();

				if (ex.removeList(delemp)) {
					System.out.println("삭제 성공!");
				} else {
					System.out.println("처리 실패!");
				}
				break;
			case 5:
				System.out.println("입사일자");
				String entryday = sc.nextLine();
				System.out.println("사번"+ "\t 이름" +"\t 입사일자");
				ex.lookList(entryday);
				break;
			case 6: 
				run = false;
			}//end of switch
			
		}//end of run 
		System.out.println("end of prog");
		sc.close();
	}//end of main
}//end of class
