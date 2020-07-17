package ex02;

public class A3 {

	int a;
	final int x = 0;		// 반드시 초기화를 해줘야함
							// 세팅되는 시기가 인스턴스변수와 다름
							// 상수다 라기보다 한번만 초기화 가능하다라는 의미.
	void print() {System.out.println(a); }
	
	public static void main(String[] args) {
		A3 a = new A3();
		a.print();
		
	}
}
