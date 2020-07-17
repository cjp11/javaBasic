package ex01;

abstract class A {
	void test() {
		System.out.println("A.test()");
	}
	void test1() {
		System.out.println("A.test1()");
	}
}


public class abst extends A{	// 추상클래스는 객체로 만들 수 없으므로 상속받아 구현해주어야함

	void test() {								//다형성
		System.out.println("abst.test()");
	}
	public static void main(String[] args) {

		abst a = new abst();
		a.test();
		a.test1();
	}

}
