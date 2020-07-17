package ex03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// print() 함수 사용
		A a = new A();
		B b = new B();
		A t = new B();	// runtime 때 오버라이딩이 됨. 
		
		
		a.print();
		b.print();
		t.print();
		t = new C();
		t.print();
		
		
		// draw 함수 사용
		/*
		Scanner sc = new Scanner(System.in);
		String in;
		A t = null;
		
		System.out.print("1. 세모  2. 네모: ");
		in = sc.nextLine();
		
		switch(in) {
		case "1":
			t = new B();
			break;
		case "2":
			t = new C();
			break;
		
		default:
			System.out.println("해당 사항 없음");
		}
		
		t.draw();
		*/
	}

}
