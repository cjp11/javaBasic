package edu.exam00.char04;
// ���ڴ� ����(2����)�� ����ȴ�. 
public class Charactor {
	public static void main(String[] args) {
		char a = 'A';	// �ƽ�Ű�ڵ�(�����ڵ� �ȿ� ���Ե� �з�)
		char b = '��';	// �����ڵ�(�� �ȿ� �ƽ�Ű�ڵ� �з��� �ִ� ��)
		System.out.println(a);
		System.out.println(b);
		
		int ia = a;
		int ib = b;
		System.out.print("10���� " +ia);
		System.out.printf(", 16���� 0x%02X%n", ia);
		System.out.print("10���� " +ib);
		System.out.printf(", 16���� 0x%02X%n", ib);
		
		char c = (char)ia;
		char d = (char)ib;
		System.out.println(c);
		System.out.println(d);
		
		int k = 10;
		System.out.println(k);
		k = 0x10;				//16����
		System.out.println(k);
		k = 010;				//8����
		System.out.println(k);
		
	}
}
