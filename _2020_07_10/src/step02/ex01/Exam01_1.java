package step02.ex01;

/*
 * Object Ŭ����
 * �ڹ��� ��� Ŭ������ Object�� ���� Ŭ�����̴�.
 * Object�� �ڹ��� ��� �������� �ֻ��� Ŭ�����̴�.
 * ��� �޴´ٰ� �������� ������ �����Ϸ��� �ڵ����� ����Ѵ�.
 * Object�� �ڹ� ��ü�� �⺻���� ������ �� �ʼ� ������ �޼��带 ������ش�. 
 */

public class Exam01_1 /*extends Object*/{
	
	public static void main(String[] args) {
		A r = new A();
		System.out.println(r.var1);
		Object obj = new A();

		System.out.println(((A)obj).var1);
	}

}
