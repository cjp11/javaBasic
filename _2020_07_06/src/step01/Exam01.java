package step01;
//JVM �޸� ���� - Ŭ���� �����
class test{
	int a;
	int b;
	public void show() {
		System.out.println("a: " + a  + " b: " + b);
	}
}
class math{
	static void add() {}
	static void sub() {}
	static void multi() {}
}
public class Exam01 {
	int a;
	static int b;
	public  static void main(String[] args) {
		System.out.println("Hello, World!");
		Exam01 ref;
		Exam01 ref3;
		math.add();
		ref = new Exam01();
		ref3 = new Exam01();
//		test.get();
		test ref1 = new test();
		test ref4 = new test();
		ref1.show();
		ref4.show();
	}
}
/* JVM�� Ŭ������ �����ϴ� ����
 * 1)Verification: .class ������ ��ȿ�� �˻� 
 * => ��¥ �����Ϸ��� ������ ����Ʈ�ڵ尡 �´��� �˻��Ѵ�.
 * => ���� ���� JVM �������� ������ �� �ִ��� �˻��Ѵ�.
 * 2)Preparatioin: ����(static) �ڿ� �غ�
 *  => .class�� ������ �� �ֵ��� �޸𸮿� �ø���.
 *  => static �ʵ�(���� �� ���)�� �غ��ϰ�, �⺻ ���� �Ҵ��Ѵ�.
 * 3)Resolution: �� Ŭ������ �����ϴ� �ٸ� Ŭ���� ���� ����
 *  => �� Ŭ������ �����ϴ� �ٸ� Ŭ������ �������̽��� ����� �� �ֵ���
 *     ������ �غ��Ѵ�.
 * 4) main() �޼��带 ȣ���Ѵ�.
 */
 