package instanceOf;

public class VehicleExam {

	public static void main(String[] args) {
		Vehicle vehicle1 = new Bus();
		Vehicle vehicle2 = new Taxi();
			
		
		
		
		Driver driver = new Driver();
		
		driver.drive(vehicle1);
		driver.drive(vehicle2);
	}

}
