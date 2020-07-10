package step02.ex01;

public class Exam02_2 {

	public static void main(String[] args) {
		String s1 = new String("hello, world!");	// 힙에 잡힘
		System.out.println(s1);
		
		String s2 = "hello, world!";	// 메소드 영역의 상수 영역에 잡힘
		System.out.println(s2);
		
		String s3 = "hello, world!";	
		
		if(s2==s3) {
			System.out.println("s2 == s3");
		}
		
		if(s1==s3) {
			System.out.println("s1 == s3");
		}
		
		String s4 = new String("hello, world!");	// 힙에 잡힘
		
		if(s1==s4) {
			System.out.println("s1 == s4");
		}
	}

}
