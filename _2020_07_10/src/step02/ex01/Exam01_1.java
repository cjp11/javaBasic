package step02.ex01;

/*
 * Object 클래스
 * 자바의 모든 클래스는 Object의 서브 클래스이다.
 * Object는 자바의 상속 계층에서 최상위 클래스이다.
 * 상속 받는다고 선언하지 않으면 컴파일러가 자동으로 상속한다.
 * Object는 자바 객체가 기본으로 가져야 할 필수 변수와 메서드를 상속해준다. 
 */

public class Exam01_1 /*extends Object*/{
	
	public static void main(String[] args) {
		A r = new A();
		System.out.println(r.var1);
		Object obj = new A();

		System.out.println(((A)obj).var1);
	}

}
