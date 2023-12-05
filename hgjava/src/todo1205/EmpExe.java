package todo1205;

import java.util.ArrayList;
import java.util.List;

public class EmpExe {
	List<Emp> enterprise;
}
	EmpExe(){
		List<Emp> enterprise = new ArrayList<>();
	}
	
	boolean addList(List<Emp> emp2) {
		for(int i = 0; i< enterprise.size();i++) {
			if(enterprise.get(i) == null) {
				enterprise.get(i).equals(emp2);
				return true;
			}
		}
		return false;
	}//end of boolean
	
	//목록
	public List<Emp> getList(){
		return enterprise;
	}
	//수정
	Boolean modifyList (String wkname, String empMoney) {
		for(int i = 0; i < enterprise.size();i++) {
			if(enterprise.get(i).getEmpName().equals(wkname)) {
				enterprise.get(i).setEmpMoney(empMoney);
				return true;
			}
		}
		return false;
	}//end of boolean
	
	//삭제 
	boolean removeList(String bname) {
		for(int i = 0; i< enterprise.size();i++) {
			if(enterprise.get(i) != null && enterprise.get(i).equals(bname)) {
				enterprise.get(i).equals(null);
				return true;
			}
		}return false;
	}		
	
}
