package ex06;

public class Student extends Person {
	String hakyun;
	
	Student() {
		System.out.println(this.hakyun + "2");
	}
	Student(String hakyun) {
		this.hakyun = hakyun;			// ��� �ᱹ ������ super�� ����Ʈ �����ڸ� ȣ���ϹǷ� Person�� �����ڸ� �ۼ����� �ʾƵ��� 
		System.out.println("hakyun �� �����");
	}
	Student(String hakyun, String name, String phone) {
		super(name, phone);
		this.hakyun = hakyun;
	}
}
