package interface_02;

public class InfaceTest02 {

	public static void main(String[] args) {
		// Fly 규칙과 Car 규칙을 동시에 구현한 클래스가 있다.
		FlyCar obj = new FlyCar();
		
		// 당연히 이 객체는 Fly규칙에 따르기 때문에 Fly 레퍼런스에 저장할 수 있다.
		Fly fly = obj;
		// 당연히 이 객체는 Car규칙에 따르기 때문에 car 레퍼런스에 저장할 수 있다.
		Car car = obj;
		
		fly.run();
		fly.takeOff();
		//fly.stop()은 불가 Fly 것이 아니기 때문
		
		car.run();
		car.stop();
		
	}

}
