package chap13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Todo {
	private String todo; 
	private Date dueDate;
	
	Todo(String todo){
		this.todo = todo;
		this.dueDate = new Date();
	}
	Todo(String todo, Date dueDate){
		this.todo = todo;
		this.dueDate = dueDate;
	}
	//toString
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return todo + "  " + sdf.format(dueDate);
	}
}
