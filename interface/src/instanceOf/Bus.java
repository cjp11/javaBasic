package instanceOf;

public class Bus implements Vehicle{
	@Override
	public void run() {
		System.out.println("버스 달린다");
	}
	
	public void checkFare() {
		System.out.println("버스 승차요금을 체크합니다");
	}
}
