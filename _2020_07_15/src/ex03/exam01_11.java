package ex03;

import java.util.HashMap;

public class exam01_11 {

	public static void main(String[] args) {
		HashMap<String, Book> map = new HashMap<>();	//String: key/ Book: data(value)
		
		Book b1 = new Book("1111", "홍길동", 100);
		Book b2 = new Book("1111", "홍길동", 100);
		Book b3 = new Book("2222", "임꺽정", 300);
		Book b4 = new Book("3333", "유관순", 400);
		Book b5 = new Book("3333", "이순신", 500);
		
		//저장할 때 해시코드를 리턴하는 키 객체는 String을 사용한다. 
		//String 클래스는 내용이 다르면 다른 해시코드를 리턴하고,
		//내용이 같으면 같은 해시코드를 리턴하게끔 hashCode()를 재정의하였기 때문이다.
		//또한 내용이 같은 객체에 대해 true를 리턴하게끔 equals()를 재정의하였기 때문이다.
		// 주의!
		// hashCode(), equals() 를 재정의하지 않은 클래스를 key로 사용해서는 안된다.
		map.put("aaa",b1);	//map.put("aaa",b6); b6을 만들었다면 b6의 값으로 update됨(key값이 같기때문)
		map.put("bbb",b1);	// 같은 주소를 저장 할 수 있다.(key값이 다르기 때문에 가능)
		map.put("ccc",b2);
		map.put("ddd",b3);
		map.put("eee",b4);
		map.put("fff",b5);
		map.put(null,b5);	// key에 null을 허용한다.
		map.put("hhh",null);	// value에 null을 허용한다.
		
		System.out.printf("aaa: %s\n", map.get("aaa").toString());
		System.out.printf("bbb: %s\n", map.get("bbb").toString());
		System.out.printf("ccc: %s\n", map.get("ccc").toString());
		System.out.printf("ddd: %s\n", map.get("ddd").toString());
		System.out.printf("eee: %s\n", map.get("eee").toString());
		System.out.printf("fff: %s\n", map.get("fff").toString());
		System.out.printf("(null): %s\n", map.get(null).toString());
		//System.out.printf("hhh: %s\n", map.get("hhh").toString()); 값에 null이 와서 실행오류?
		
	}

}
