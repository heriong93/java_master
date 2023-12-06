package todo1206;

public class Product {
	private String proNum;
	private String proName;
	private int proPrice;
	private int proStock;

	Product() {
	}

	public Product(String proNum, String proName, int proPrice, int proStock) {
		this.proNum = proNum;
		this.proName = proName;
		this.proPrice = proPrice;
		this.proStock = proStock;
	}

	void showInfo() {
		System.out.println(proNum + "\t" + proName + "\t" + proPrice);
	}

	public String getProNum() {
		return proNum;
	}

	public String getProName() {
		return proName;
	}

	public int getProPrice() {
		return proPrice;
	}
	

	public int getProStock() {
		return proStock;
	}

	public void setProStock(int proStock) {
		this.proStock = proStock;
	}

	public void setProNum(String proNum) {
		this.proNum = proNum;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public void setProPrice(int proPrice) {
		this.proPrice = proPrice;
	}

}
