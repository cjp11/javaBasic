package step01.ex01;

public class Exam01 {

	public static void main(String[] args) {
		SUV r = new SUV();
		
		System.out.printf("cc = %d\n", r.cc);
		System.out.printf("maker = %s\n", r.maker);
		System.out.printf("rpm = %f\n", r.rpm);
		System.out.printf("capacity = %d\n",r.capacity);
		System.out.printf("weight = %d\n", r.weight);
	}

}

/*
 * 인스턴스 변수 준비 과정: new SUV();
 * 1) 슈퍼 클래스의 설계도를 참고하여 인스턴스 변수를 준비한다.
 * 모든 인스턴스 변수는 0으로 초기화 된다.
 * boolean은 false, 레퍼런스는 null, integer는 0, 부동소수점은 0.0,
 * 문자는 \u0000(0) 으로 초기화
 * 2) 초기화문(변수 선언에 포함된 할당문)실행
 * -> cc(0), maker(null), capacity(20), weight(800)
 * 3) 생성자 실행
 * -> cc(100), maker("미정"), capacity(4), weight(1200)
 */