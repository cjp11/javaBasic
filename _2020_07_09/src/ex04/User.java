package ex04;

public class User {
	String name;
	String email;
	String password;
	static int count;
	
	static {	// static 블록: 클래스가 로딩된 후 자동으로 실행되는 블록
		System.out.println("User 클래스 로딩");
	}
	User() {
		System.out.println("User()생성자 호출");
	}
	static void increaseCount() {
		count++;	// 같은 클래스에 소속된 경우,
					// static 변수나 매서드를 사용할 때 클래스 이름 생략 가능.
	}
	 
}
