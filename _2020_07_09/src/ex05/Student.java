package ex05;

public class Student extends Person {
	String hakyun;
	
	Student() {
		
	}
	Student(String hakyun) {
		this.hakyun = hakyun;			// ��� �ᱹ ������ super�� ����Ʈ �����ڸ� ȣ���ϹǷ� Person�� �����ڸ� �ۼ����� �ʾƵ��� 
	}
	Student(String hakyun, String name, String phone) {
		super(name, phone);
		this.hakyun = hakyun;
	}
}
