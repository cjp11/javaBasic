package ex02;

public class exam01_4 {

	public static void main(String[] args) {
		//1) 리터럴로 인스턴스 생성(오토박싱)
		Integer obj1 = 20;	// String 처럼 상수 저장소에 인스턴스를 생성한다.
		Integer obj2 = 20;	// 기존에 생성된 인스턴스 주소를 리턴한다.
		if(obj1 == obj2) {
			System.out.println("obj1 == obj2");
		}
		
		int i = 40;
		i = 50;
		i = 60;
		obj1 = 30;
		obj2 = 30;
		obj1 = 40;
		obj1 = 50;
	
		
		
		
		Integer obj3 = 30;
		if(obj2 == obj3) {
			System.out.println("obj2 == obj3");
		}
		// 2) 직접 new 연산자를 이용하여 인스턴스 생성
		Integer obj4 = new Integer(100);	// 힙에 인스턴스 생성
		Integer obj5 = new Integer(100);	// 힙에 인스턴스 생성
		if(obj4 == obj5) {
			System.out.println("obj4 == obj5");
		}
		
		if(obj4.equals(obj5)) {				//값을 비교
			System.out.println("obj4.equals(obj5)");
		}
	}

}
