package step01;

public class Exam03 {
	// 1) 값을 받고 리턴하는 매서드 ( 파라미터; 외부에서 입력한 값을 받는 변수)
	// int func(int a, int b) {} => argument: 매서드 호출시 전달하는 값
	// => ex) int result = fun(10,20);  10,20 이 argument이다.
	// 리턴 타입: 매서드 실행 후 리턴하는 값의 데이터 타입
	
	static int m1(int a, int b) {
		return a + b;  // 값을 반환할 때 return 명령을 사용 
	}
	
	// 2) 값을 받고 결과를 리턴하지 않는 매서드
	static void m2(int a, int b) {
		if(b==0) {
			return; // 함수 실행을 멈추고 호출한 곳으로 간다.
		}
		System.out.println(a/b);
	}
	
	// 3) 값을 받지 않고 결과를 리턴하는 매서드
	static int m3() {	// 값을 받지 않는다고 void를 선언해서는 안됨.
		return 100; 	// 반드시 int 타입으로 리턴해야함. 
	}
	
	// 4) 값도 받지 않고 결과도 리턴하지 않는 매서드
	static void m4() {
		System.out.println("???");
	}
	
	static void fm() {
		System.out.println("fm()");
	}
	static void fm(int a) {
		System.out.println(a);
	}
	static void fm(short a) {
		System.out.println("short " + a);
	}
	static void fm(int a, int b) {
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) {
		
		// 1)번 매서드
		int result = m1(10,20);
		System.out.println(result);
		
		// 2)번 매서드
		m2(5,2);
		
		// 3)번 매서드
		System.out.println(m3());
		
		// 4)번 매서드
		m4();
		fm();
		fm(1);
		fm((short)1);
		fm(1,2);
		// System.out.println(m4()); 인자를 전달받을 목적으로 쓰여진 코드인데  return 값이 없으므로 오류,
		System.out.println();
	}
}
