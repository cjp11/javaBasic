package ex01;

public class InfaceTest03 {

	public static void main(String[] args) {
		MyCar car = new MyCar();
		car.start(); // Moter �������̽��� ���� ��ӹ��� �޼���
		car.run(); // Sedan, Truck �������̽��κ��� ��ӹ��� �޼���
		car.dump(); // Truck �������̽��κ��� ��ӹ��� �޼���
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
