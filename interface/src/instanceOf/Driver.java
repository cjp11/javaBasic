package instanceOf;

public class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {	// vehicle이 참조하는 객체가 BUS인지 조사 
			Bus bus = (Bus) vehicle;	// 클래스 타입으로 강제 변환해주어야 
			bus.checkFare();			// 이 함수 사용가능 
		}
		else if(vehicle instanceof Taxi) {
			Taxi taxi = (Taxi) vehicle;
			taxi.speed();
		}
		
		vehicle.run();
	}
}
