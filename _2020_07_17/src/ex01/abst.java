package ex01;

abstract class A {
	void test() {
		System.out.println("A.test()");
	}
	void test1() {
		System.out.println("A.test1()");
	}
}


public class abst extends A{	// �߻�Ŭ������ ��ü�� ���� �� �����Ƿ� ��ӹ޾� �������־����

	void test() {								//������
		System.out.println("abst.test()");
	}
	public static void main(String[] args) {

		abst a = new abst();
		a.test();
		a.test1();
	}

}
