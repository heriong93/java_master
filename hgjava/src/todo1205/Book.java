package todo1205;
//도서코드/ 도서명/저자/ 출판사/가격 정보 저장
public class Book {
	String bookNum;
	String bookName;
	String bookAuth;
	String bookComp;
	String bookPrice;
	
	Book(){
		
	}
	public Book(String bookNum, String bookName, String bookAuth, String bookComp, String bookPrice){
		this.bookNum = bookNum;
		this.bookName = bookName;
		this.bookAuth = bookAuth;
		this.bookComp = bookComp;
		this.bookPrice = bookPrice;
	}
	
	
	void showInfo() {
		System.out.println(bookNum +"\t"+bookName+"\t"+ bookAuth+"\t"+bookPrice);
		
	}

	public String getBookNum() {
		return bookNum;
	}

	public String getBookName() {
		return bookName;
	}

	public String getBookAuth() {
		return bookAuth;
	}

	public String getBookComp() {
		return bookComp;
	}

	public String getBookPrice() {
		return bookPrice;
	}

	public void setBookNum(String bookNum) {
		this.bookNum = bookNum;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setBookAuth(String bookAuth) {
		this.bookAuth = bookAuth;
	}

	public void setBookComp(String bookComp) {
		this.bookComp = bookComp;
	}

	public void setBookPrice(String bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	
}
