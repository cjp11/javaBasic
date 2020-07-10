package step01.ex01;

public class Exam01_3 {

	// 다형성
	void print(Car car) {
		if(car instanceof Bus) {	//car가 Bus의 인스턴스냐
			Bus b = (Bus)car;
			b.print();
		}
		if(car instanceof Texi) {
			Texi t = (Texi)car;
			t.print();
		}
	}
	/* 너무 많은 함수가 필요
	  static void print(Bus b) {
	    b.print();
	  }
	  
	*/
	

	
	public static void main(String[] args) {
		Motor r1 = new Car();
		
		r1.cc = 100;
		r1.maker = "비트자동차";
		
		//r1.capacity = 200;	// 컴파일 타임에서는 Motor타입으로 인식하므로 오류.
							// Car에서 선언한 변수 사용
							// 이유: 컴파일러는 레퍼런스 타입에 선언된 항목만 사용할 수 있다.
							// 		실제 해당 인스턴스 변수(이 경우 capacity)가 존재한다하더라도
							// 		접근 불가능!
		Car c = (Car)r1;
		c.capacity = 200;
		
		c.cc = 200;
		System.out.println("r1.cc: " + r1.cc);
		System.out.println("c.cc: " + c.cc);
		
		Bus b1 = new Bus();
		Texi t1 = new Texi();
		
		Exam01_3 obj = new Exam01_3();
		obj.print(b1);
		obj.print(t1);
		
		//print(b1);	-> static void print() 일때 사용
		//print(t1);
	
	}

}
