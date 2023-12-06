package test;

import java.util.ArrayList;
import java.util.List;

public class EmpDAO {
	private List<Employee> enter;

	// 추가
	EmpDAO() {
		enter = new ArrayList<>();
	}
	public List<Employee> getList() {
		return enter;
	}
	// 수정

	public boolean modifyPay(String emnum, String empay) {
		
		for (int i = 0; i < enter.size(); i++) {
			String payChange = enter.get(i).getEmpName();
			if (emnum.equals(payChange)) {
				enter.get(i).setEmpMoney(empay);
				return true;
			}
		}
		return false;
	}

	// 삭제
	boolean removeList(String bnum) {
		for (int i = 0; i < enter.size(); i++) {
			String deleteEmp = enter.get(i).getEmpNum();
			if (bnum.equals(deleteEmp)) {
				enter.remove(i);
				System.out.println("삭제 되었습니다");
				return true;
			}
		}
		return false;
	}
	// 조회

	boolean lookList(String endate) {
		for (int i = 0; i < enter.size(); i++) {
			if (enter.get(i).getEmpDate().equals(endate)) {
				System.out.println(enter.get(i).getEmpNum() + enter.get(i).getEmpName() + enter.get(i).getEmpDate());
//				enter.get(i).showInfo();
				return true;
			}
		}
		return false;
	}

}// end of class
