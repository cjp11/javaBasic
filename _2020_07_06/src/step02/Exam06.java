package step02;

public class Exam06 {

	public static void main(String[] args) {
		Board5 b1 = new Board5();
		b1.contents = "내용입니다.";
		b1.writer = "홍길동";
		b1.printInfo();
		//메서드 호출에 대한 표현
		//1) b1 인스턴스에 대한 printInfo() 명령을 수행하라.
		//2) b1 데이터에 대해 printInfo() 연산을 수행하라.
		//3) b1 객체에 printInfo() 메시지를 보낸다.
		
		
		System.out.println("---------------------------");
		
		
		// 기본 생성자 대신 다른 생성자를 지정한다.
		// => 문자열 값을 세 개 받는 생성자 호출 
		Board5 b2 = new Board5("테스트","내용이래요","홍길동");
		b2.printInfo();
		
		Board5 b3 = new Board5(1,"제목");
		b3.printInfo();

	}
}







