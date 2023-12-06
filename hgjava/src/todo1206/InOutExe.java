package todo1206;

import java.util.ArrayList;
import java.util.List;

import todo1205.Emp;

public class InOutExe {
	List<InOut> inout;

	InOutExe() {
	inout = new ArrayList<>();
	}

	// 목록 저장
	boolean addList(InOut sell) {
		return inout.add(sell);
	}// end of boolean
	// 목록 저장
		boolean addPurchList(InOut sell) {
			return inout.add(sell);
		}// end of boolean
	// 목록
	public List<InOut> getList() {
		return inout;
	}

	void showList() {
		for(int i = 0; i < inout.size();i++) {
			inout.get(i).shortShowInfo();
		}
	}
	// 판매
	public boolean sellItem(String itnum, String itdate, int itleft, String itsold) {
		for (int i = 0; i < inout.size(); i++) {
			if (inout.get(i).getItNum().equals(itnum)) {
				inout.get(i).itLeft -= itleft; 
			}return true;
		}
		return false;
	}


	// 추가
	Boolean addItems(String itemn, String itdate, int itsold, String item) {
		for (int i = 0; i < inout.size(); i++) {
			if (inout.get(i).getItNum().equals(itemn)) {
				inout.get(i).itLeft += itsold;
				return true;
			}
		}
		return false;
	}// end of boolean
}//end of class
