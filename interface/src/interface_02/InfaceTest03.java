package interface_02;

public class InfaceTest03 {

	public static void main(String[] args) {
		Motor mt = new MyCar();
		mt.start();
		
		Sedan sd = new MyCar();
		sd.start();
		sd.run();
		
		BitCar bc = new Taxi();
		bc.run();
		bc.start();
		BitCar bb = new MyCarAdapter();
		bb.run();
		bb.dump();
		bb.start();
		bb.openSunroof();
		bb.stop();
		bb.start();
		
		
		
	
	}

}
