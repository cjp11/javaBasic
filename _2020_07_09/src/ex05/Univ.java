package ex05;

public class Univ extends Student {
	String major;
	Univ() {}
	Univ(String major) {
		this.major = major;
	}
	Univ(String major, String hakyun) {
		super(hakyun);
		this.major = major;
		//this();
	}
	Univ(String major, String hakyun, String name, String phone) {
		super(hakyun,name,phone);
		this.major = major;
	
	}
}
