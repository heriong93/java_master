package todo1206;

public class InOut {
	String itNum;
	String itDate;
	int itLeft;
	String itSale;
	

	public InOut(String itNum, String itDate, int itLeft, String itSale ) {
		this.itNum = itNum;
		this.itDate = itDate;
		this.itLeft = itLeft;
		this.itSale = itSale;
		
	}
	public InOut(String itNum, String itDate, int itLeft) {
		this.itNum = itNum;
		this.itDate = itDate;
		this.itLeft = itLeft;
	}
	public InOut(String itNum,int itLeft) {
		this.itNum = itNum;
		this.itLeft = itLeft;
	}
	void showInfo() {
		System.out.println(itNum+"\t"+itDate+"\t"+itLeft+"\t"+itSale);
	}
	void shortShowInfo() {
		System.out.println(itNum+"\t"+itLeft);
	}
	public String getItNum() {
		return itNum;
	}
	public String getItDate() {
		return itDate;
	}
	public int getItLeft() {
		return itLeft;
	}
	
	
	public String getItSale() {
		return itSale;
	}
	public void setItSale(String itSale) {
		this.itSale = itSale;
	}
	public void setItNum(String itNum) {
		this.itNum = itNum;
	}
	public void setItDate(String itDate) {
		this.itDate = itDate;
	}
	public void setItLeft(int itLeft) {
		this.itLeft = itLeft;
	}
	
	
}

