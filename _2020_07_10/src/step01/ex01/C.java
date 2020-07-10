package step01.ex01;

public class C extends B{
	public void m1() {
		System.out.println("C의 m1() 호출...");
	}
	public void m2() {
		System.out.println("C의 m2() 호출...");
	}
	public void m4() {
		System.out.println("-----------------");
		this.m1();
		this.m2();
		this.m3();
		
		super.m2();
		super.m1();
	}
}
