package ex01;

public class MyCar implements BitCar {

	@Override
	public void run() {
		System.out.println("달린다.........");
	}

	@Override
	public void dump() {
		System.out.println("짐을 내린다.........");
	}

	@Override
	public void start() {
		System.out.println("시동건다.........");

	}

	@Override
	public void openSunroof() {
		System.out.println("썬루프를 연다.........");
	}

	@Override
	public void stop() {
		System.out.println("멈춘다.........");
	}

}
