package todo1206;

import java.util.ArrayList;
import java.util.List;

import todo1205.Emp;

public class ProductExe {
	private List<Product> items;

	ProductExe() {
		items = new ArrayList<>();
	}

	//목록 저장 
	boolean addList(Product list) {
		return items.add(list);
	}//end of boolean
	
	
	//목록보기 
	public List<Product> getList() {
		return items;
	}

	void showList() {
		for(int i = 0; i < items.size();i++) {
			items.get(i).showInfo();
		}
	}
	
	// 수정
	Boolean modifyPrice(String itnum, int itprice) {
		for (int i = 0; i < items.size(); i++) {
			if (items.get(i).getProNum().equals(itnum)) {
				items.get(i).setProPrice(itprice);
				return true;
			}
			System.out.println(itnum);
			System.out.println(items.get(i).getProNum());
		}
		return false;
	}// end of boolean

	public void addList(InOut inOut) {
		return items.
	}


}// end of class
