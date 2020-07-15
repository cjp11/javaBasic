package ex03;
/*
 * 	HashMap
 * -> 값을 저장하는 규칙
 *  - key 객체의 해시코드를 이용하여 value를 저장하고 꺼낸다
 *  - key로 사용할 클래스는 반드시 hashCode()와 equals()를 오버라이딩해야한다.
 *  - key와 value에 null을 사용할 수 없다.
 *  - Thread-safe 하지 않다. 멀티 스레드 환경을 지원한다.
 *    단, 동기화 처리로 속도가 느리다.
 */

import java.util.HashMap;

public class exam01_13 {

	public static void main(String[] args) {
		HashMap<MyKey, Book>map = new HashMap<>();
		
		Book b1 = new Book("1111", "홍길동", 100);
		Book b2 = new Book("2222", "임꺽정", 300);
		Book b3 = new Book("3333", "유관순", 400);
		
		MyKey key1 = new MyKey(10,100);
		MyKey key2 = new MyKey(20,200);
		MyKey key3 = new MyKey(23,9890);

		// 1) 값 저장: key 객체의 해시코드를 이용하여 value를 저장한다. 
		map.put(key1,b1);
		map.put(key2,b2);
		map.put(key3,b3);
		
		// 2) 값 꺼내기: Key 객체의 해시코드를 이용하여 value를 꺼낸다.
		System.out.println(map.get(key1));
		System.out.println(map.get(key2));
		System.out.println(map.get(key3));
	
		
		MyKey key4 = new MyKey(10,100);			// equals, hashCode 재정의 해보자
		System.out.println(map.get(key4));
		System.out.println(key1.hashCode());
		System.out.println(key4.hashCode());
		
	
	}

}
