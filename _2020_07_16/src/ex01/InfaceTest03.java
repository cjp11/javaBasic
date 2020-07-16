package ex01;

public class InfaceTest03 {

	public static void main(String[] args) {
		MyCar car = new MyCar();
		car.start(); // Moter 인터페이스로 부터 상속받은 메서드
		car.run(); // Sedan, Truck 인터페이스로부터 상속받은 메서드
		car.dump(); // Truck 인터페이스로부터 상속받은 메서드
		car.openSunroof();	//Sedan "" 
		car.stop();	// BitCar ""
		System.out.println("--------------------");
		
		Taxi t = new Taxi(); 
		t.dump();
		t.openSunroof();
		t.run();
		t.start();
		t.stop();
	}

}
