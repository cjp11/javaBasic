package instanceOf;

public class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {	// vehicle�� �����ϴ� ��ü�� BUS���� ���� 
			Bus bus = (Bus) vehicle;	// Ŭ���� Ÿ������ ���� ��ȯ���־�� 
			bus.checkFare();			// �� �Լ� ��밡�� 
		}
		else if(vehicle instanceof Taxi) {
			Taxi taxi = (Taxi) vehicle;
			taxi.speed();
		}
		
		vehicle.run();
	}
}
