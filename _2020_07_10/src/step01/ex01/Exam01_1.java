package step01.ex01;

public class Exam01_1 {

	public static void main(String[] args) {
		Motor r1 = new Motor();
		// r1레퍼런스는 Motor()
		// 즉 Motor에 있는 도구만 사용할 수 있다.
		// 물론, Motor의 수퍼 클래스 도구도 내 것처럼 사용가능
		r1.cc = 100;
		r1.maker = "비트 자동차";
	//	r1.capacity = 4; 상속받지 않은 변수이므로 컴파일 오류
	}

}
