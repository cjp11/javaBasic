package ex03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// print() �Լ� ���
		A a = new A();
		B b = new B();
		A t = new B();	// runtime �� �������̵��� ��. 
		
		
		a.print();
		b.print();
		t.print();
		t = new C();
		t.print();
		
		
		// draw �Լ� ���
		/*
		Scanner sc = new Scanner(System.in);
		String in;
		A t = null;
		
		System.out.print("1. ����  2. �׸�: ");
		in = sc.nextLine();
		
		switch(in) {
		case "1":
			t = new B();
			break;
		case "2":
			t = new C();
			break;
		
		default:
			System.out.println("�ش� ���� ����");
		}
		
		t.draw();
		*/
	}

}
