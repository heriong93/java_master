package todo1205;

import java.util.ArrayList;
import java.util.List;

//등록기능,목록기능,수정기능,삭제기능
public class BookExe {
	List<Book> books;
	
	//추가
	BookExe(){
		List<Book> books = new ArrayList<>();
		books.add(new Book("B001","이것이 자바다","신용권","예담","25000"));
	}
	
	boolean addBook(Book books2) {
		return books.add(books2);
	}//end of boolean
	
	//목록
	public List<Book> getBooks(){
		return books;
	}
	
	//수정
	Boolean modifyBookp(String bookn, String bprice) {
		for(int i = 0; i < books.size();i++) {
			if(books.get(i).getBookNum().equals(bprice)) {
				books.get(i).setBookPrice(bprice);
				return true;
			}
		}
		return false;
	}//end of boolean
	
	//삭제 
	boolean removeBook(String bnum) {
		for(int i = 0; i< books.size();i++) {
			if(books.get(i) != null && books.get(i).equals(bnum)) {
				books.get(i).equals(null);
				return true;
			}
		}return false;
		
	}//end of removeBook
	
}//end of class