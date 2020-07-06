package step01;

public class Exam03 {
	// 1) ���� �ް� �����ϴ� �ż��� ( �Ķ����; �ܺο��� �Է��� ���� �޴� ����)
	// int func(int a, int b) {} => argument: �ż��� ȣ��� �����ϴ� ��
	// => ex) int result = fun(10,20);  10,20 �� argument�̴�.
	// ���� Ÿ��: �ż��� ���� �� �����ϴ� ���� ������ Ÿ��
	
	static int m1(int a, int b) {
		return a + b;  // ���� ��ȯ�� �� return ����� ��� 
	}
	
	// 2) ���� �ް� ����� �������� �ʴ� �ż���
	static void m2(int a, int b) {
		if(b==0) {
			return; // �Լ� ������ ���߰� ȣ���� ������ ����.
		}
		System.out.println(a/b);
	}
	
	// 3) ���� ���� �ʰ� ����� �����ϴ� �ż���
	static int m3() {	// ���� ���� �ʴ´ٰ� void�� �����ؼ��� �ȵ�.
		return 100; 	// �ݵ�� int Ÿ������ �����ؾ���. 
	}
	
	// 4) ���� ���� �ʰ� ����� �������� �ʴ� �ż���
	static void m4() {
		System.out.println("???");
	}
	
	static void fm() {
		System.out.println("fm()");
	}
	static void fm(int a) {
		System.out.println(a);
	}
	static void fm(short a) {
		System.out.println("short " + a);
	}
	static void fm(int a, int b) {
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) {
		
		// 1)�� �ż���
		int result = m1(10,20);
		System.out.println(result);
		
		// 2)�� �ż���
		m2(5,2);
		
		// 3)�� �ż���
		System.out.println(m3());
		
		// 4)�� �ż���
		m4();
		fm();
		fm(1);
		fm((short)1);
		fm(1,2);
		// System.out.println(m4()); ���ڸ� ���޹��� �������� ������ �ڵ��ε�  return ���� �����Ƿ� ����,
		System.out.println();
	}
}
