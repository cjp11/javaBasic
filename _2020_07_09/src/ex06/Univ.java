package ex06;

public class Univ extends Student {
	String major;
	Univ() {
		
		System.out.println(this.major + "3");
	}
	Univ(String major) {
		this.major = major;
	}
	Univ(String major, String hakyun) {
		super(hakyun);
		this.major = major;
		System.out.println("major °ª ÀúÀåµÊ");
		
	}
	Univ(String major, String hakyun, String name, String phone) {
		super(hakyun,name,phone);
		this.major = major;
	
	}
}
