package step01.ex01;

public class Exam01_2 {

	public static void main(String[] args) {
		// r1은 Motor 타입이지만, Car 인스턴스 주소를 담을 수 있다.
		// 이유? Car는 Motor의 모든 기능을 상속 받았기 때문에,
		// Car 안에 Motor 내용이 잇어서 가능하다.
		// 문법: 레퍼런스는 서브 클래스의 인스턴스를 가리킬 수 있다. 
		Motor r1 = new Car();	// 다형성
		
		r1.cc = 100;
		r1.maker = "비트자동차";
		
		Car r2 = new SUV();
		r2.cc = 100;
		r2.maker = "비트자동차";
		r2.capacity = 4;
		
		Motor r3 = new SUV();
		r3.cc = 200;
		r3.maker = "비트 자동차";
		
		// 자식 클래스의 레퍼런스는 슈퍼 클래스 인스턴스를 가리킬 수 있는가?
		// -> 허락되지 않는다. 컴파일 오류
		// -> 왜? 슈퍼클래스의 인스턴스 하위 클래스가 가져야할 변수가
		//	  메서드가 없을 수 있기 때문이다.
		// SUV r4 = new Car();
	

	}

}

/* 
 * 레퍼런스에 저장할 수 있는 주소
 * -> 해당 타입 및 서브 클래스의 인스턴스 주소를 저장할 수 있다.
 * -> 그러나 슈퍼클래스의 인스턴스 주소는 저장할 수 없다.
 */
