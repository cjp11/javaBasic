package ex06;

public class Person {
	String name;
	String phone;
	
	Person() {
		System.out.println(this.name + "1");
		System.out.println(this.phone + "1");
	}
	
	Person(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
}
