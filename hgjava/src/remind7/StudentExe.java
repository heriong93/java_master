package remind7;
//저장공간:배열
//추가/수정/삭제/목록/단건 조회

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

import chap13.Member;

public class StudentExe {
	//배열: 
	private ArrayList<Book> books ;
	
	//생성자 
	BookExe(){
		
		books = new ArrayList<Book>();
		books.add(new Book("23-001","홍길동",77,88));
		books.add(new Book("23-002","김철수",88,90));
		
	}
	//추가
	boolean addBook(Book book) {
		return books.add(book);
	}
	
	//목록
	
	ArrayList<Book> getBookList(){
		return books;
	}
	//단건조회 
	Book getBook(String bookCode) {
		for(int i = 0; i < books.size();i++) {
			if(books.get(i) != null && books.get(i).getBookCode().equals(bookCode)) {
				return books.get(i);
			}
		}
		return null;
		
	}
	
	//수정
	boolean modifyBook(String no, int price) {
		for(int i = 0; i< books.size(); i++) {
			if(books.get(i) != null && books.get(i).getBookCode().equals(no)) {
				books.get(i).setEngScore();
				books.get(i).setMathScore(math);
				return true;
			}
		}
		return false;
	}
	//삭제
	boolean removeBook(String bookCode) {
		for(int i = 0; i<books.size();i++) {
			if(books.get(i) != null && books.get(i).getBookCode().equals(bookCode)) {
				books.remove(i);
				return true;
			}
		}
		return false;
		
	}
}
