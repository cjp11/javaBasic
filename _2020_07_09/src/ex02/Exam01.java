package ex02;

public class Exam01 {

	public static void main(String[] args) {
		Calculator calc = null;
		// 인스턴스를 사용하지 않는 매서드를 호출하더라도
		// 그 매서드가 인스턴스 매서드인 경우
		// 무조건 유효한 인스턴스 주소를 넘겨야 한다.
		// 인스턴스 주소가 null이다. 따라서 실행 오류
		
	//	calc.plus(3);		//주소값이 없는데 어덯게 알고 plus에 접근하는가?
							//컴파일러가 오류를 안내는 이유: calc이 Calculator 타입을 보고 함수 위치를 아는 것
		calc = new Calculator();
		calc.plus(3);
		calc.plus(7);
		calc.minus(5);
		System.out.println(calc.result);
	}

}
