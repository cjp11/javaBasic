package step02.ex01;

public class Exam01_3 {

	public static void main(String[] args) {
		A2 r1 = new A2();		// new A:  A 주소값 가지고 오고 메모리에 클래스를 로드하는 작업 + () 호출하는 부분
		A2 r2 = new A2();
		
		System.out.printf("r1.toString(): %s\n", r1.toString());
		
		if(r1 == r2) {
			System.out.println("r1==r2");
		}
		
		System.out.println("r1.var1: " + r1.var1);
		System.out.println("r2.var1: " + r2.var1);
		
		if(r1.equals(r2)) {	// equals를 재정의 해보자 
			System.out.println("r1.equals(r2)");
		}
		
		String s1 = new String("aaa");
		String s2 = new String("aaa");
		if(s1 == s2) {
			System.out.println("s1 == s2");
		}
		if(s1.equals(s2)) {
			System.out.println("s1.equals(s2)");
		}
		
	}

}
