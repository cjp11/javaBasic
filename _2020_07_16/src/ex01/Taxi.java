package ex01;

public class Taxi extends MyCarAdapter {
	@Override
	public void run() {
		System.out.println("택시가 달린다");
	}

	@Override
	public void start() {
		System.out.println("택시가 출발한다");
	}

	@Override
	public void stop() {
		System.out.println("택시가 멈춘다");
	}
	
}
