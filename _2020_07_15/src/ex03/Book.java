package ex03;

public class Book {
	String title;
	String author;
	int pageSize;
	

	public Book() {	}
	public Book(String title, String author, int pageSize) {
		this.title = title;
		this.author = author;
		this.pageSize = pageSize;
	}
	
	public String toString() {
		return "Book[title=" + title + ", author " + author + ", pageSize= " + pageSize + "]";
	}
}
