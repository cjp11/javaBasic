package ex06;

public class Student extends Person {
	String hakyun;
	
	Student() {
		System.out.println(this.hakyun + "2");
	}
	Student(String hakyun) {
		this.hakyun = hakyun;			// 얘는 결국 숨겨진 super가 디폴트 생성자를 호출하므로 Person에 생성자를 작성하지 않아도됨 
		System.out.println("hakyun 값 저장됨");
	}
	Student(String hakyun, String name, String phone) {
		super(name, phone);
		this.hakyun = hakyun;
	}
}
