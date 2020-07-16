package step02;
/*
 * 주제 String 클래스 - intern(): 일반 String 인스턴스의 값을 가지고 상수 스트링 풀에 생성한다. 
 * 
 */
public class Exam01_4 {

	public static void main(String[] args) {
		String s1 = new String("hello");
		
		String s2 = s1.intern();	// 상수풀에 s1 값이 존재해야 intern()을 사용할 수 있음. 
		String s3 = "hello";		// 상수 스트링 풀에 String 인스턴스를 생성하라
									// 이미 이전에 상수 스트링 풀에 해당 값을 갖는 인스턴스가 존재하고 있다. 
		
		if(s2 == s3) {
			System.out.println("s2 == s3");
		}
		String s4 = new String("hello");
		String s5 = s4.intern();
		if(s3 == s5) {
			System.out.println("s3 == s5");
		}
		

	}

}
