package ex01;
/*
 * 클래스는 한 개 이상의 인터페이스를 구현할 수 있다.
 * 같은 시그너처를 가진 매서드가 있는 경우 한 개만 구현하면 된다.
 */
public class FlyCar implements Fly, Car{

	@Override
	public void stop() {
		System.out.println("멈춘다.........");
	}

	@Override
	public void run() {		// Fly, Car에 둘다 있음. 하나의 메소드로 작성해주면됨
		System.out.println("달린다.........");
	}

	@Override
	public void takeOff() {
		System.out.println("이륙한다........");
	}
	
}
