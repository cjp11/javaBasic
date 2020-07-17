package ex03;

public class Book2 {
	String title;
	String author;
	int pageSize;
	

	public Book2() {	}
	public Book2(String title, String author, int pageSize) {
		this.title = title;
		this.author = author;
		this.pageSize = pageSize;
	}
	// override
	public String toString() {
		return "Book[title=" + title + ", author " + author + ", pageSize= " + pageSize + "]";
	}
	
	// override
	public int hachCode() {
		return 1;
	}
}
