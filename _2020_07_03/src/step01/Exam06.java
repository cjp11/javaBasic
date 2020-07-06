package step01;

// 많이 쓰는 함수를 Array 클래스에 정의를 해 놓고 다른 클래스(Exam06) 에서 가져다 쓸 수 있음 (같은 패키지에 있으므로 사용 가능)
public class Exam06 {

	public static void main(String[] args) {
		/*
		int[] arr = new int[20];
		Array.initByIndexValue(arr);
		Array.mix(arr);
		Array.printAll(arr,-1);
		Array.sort(arr);
		Array.printAll(arr,-1);
		System.out.println("------\t\t\t\t\t------");
		Array.mix(arr);
		Array.printAll(arr,-1);
		Array.sort(arr);
		Array.printAll(arr,-1);
		*/
		Car.cnt = 7; //가능
		// Car.a = 8; 불가, 클래스 변수이므로 (아직 객체 생성하지 않음) 
		
		Car c = new Car();
		//c.a = 8; // 만들어 졌으니까 데이터를 사용할 수 있음. 
		c.show();
		Car c1 = new Car();
		c1.show();
		
		Car.show();
		//Car.print();  객체 생성 안했으므로 일반 클래스 함수는 사용할 수 없음. 
		
		
		c.show();
		c.print();
	}

}
