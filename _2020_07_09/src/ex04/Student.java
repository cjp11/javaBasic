package ex04;

public class Student extends User{

	String tel;
	boolean working;
	
	static {
		System.out.println("Student 클래스 로딩");
	}
	Student() {
		System.out.println("Studet()생성자 호출");
	}
	 
}
