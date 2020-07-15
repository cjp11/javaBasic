package ex03;

public class Book3 {
	String title;
	String author;
	int pageSize;
	

	public Book3() {}
	public Book3(String title, String author, int pageSize) {
		this.title = title;
		this.author = author;
		this.pageSize = pageSize;
	}
	@Override
	public String toString() {
		return "Book[title=" + title + ", author " + author + ", pageSize= " + pageSize + "]";
	}
	@Override
	public int hashCode() {
		return 1;
	}
	@Override
	public boolean equals(Object obj) {
		return true;
	}
}
