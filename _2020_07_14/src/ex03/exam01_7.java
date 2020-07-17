package ex03;

//import java.awt.print.Book;
import java.util.HashSet;

public class exam01_7 {

	public static void main(String[] args) {
		HashSet<Book> set = new HashSet<>();
		
		//1) equals(), hashCode() 재정의하기 전
		Book b1 = new Book("자바프로그래밍","홍길동",500);
		Book b2 = new Book("자바프로그래밍","홍길동",500);
		
		System.out.printf("b1: %d\n", b1.hashCode());
		System.out.printf("b2: %d\n", b2.hashCode());
		
		if(b1.equals(b2)) {
			System.out.println("b1.hashCode");
		}
		set.add(b1);
		set.add(b2);
		
		System.out.println("-----------------------");
		for(Book book: set) {
			System.out.println(book);
		}
		
	}

}
