package ex03;

import java.util.HashSet;

public class exam01_8 {

	public static void main(String[] args) {
		HashSet<Book2> set = new HashSet<>();
		
		//1) hashCode()만 재정의
		Book2 b1 = new Book2("자바프로그래밍","홍길동",500);
		Book2 b2 = new Book2("자바프로그래밍","홍길동",500);
		
		System.out.printf("b1: %d\n", b1.hashCode());
		System.out.printf("b2: %d\n", b2.hashCode());
		
		if(b1.equals(b2)) {
			System.out.println("b1.hashCode");
		}
		set.add(b1);
		set.add(b2);
		
		System.out.println("-----------------------");
		for(Book2 book: set) {
			System.out.println(book);
		}
	}

}
