package interface_02;

public class InfaceTest01 {

	public static void main(String[] args) {
		// 다형적 변수 규칙에 따라 인터페이스 레퍼런스 변수에
		// 그 인터페이스를 구현한 클래스의 객체(의 주소)를 저장할 수 있다.
		// Calc c = new Calc();	// 인터페이스는 인스턴스를 만들 수 없다.
		Calc c = new CalcImplement();
		
		//"인터페이스 구현체"
		//-> CalcImplement 클래스처럼 인터페이스 규칙에 따라 만든 클래스를 부르는 말.
		System.out.println(c.plus(10,30));
	}

}
