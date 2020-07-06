package step01;

public class recarMain {

	public static void main(String[] args) {
		reCar c = new reCar();
		c.cnt = 1;
		
		reCar c1 = new reCar();
		c1.cnt = 3;
		System.out.println("c.cnt: "+ c.cnt);			// 3 출력
		System.out.println("c1.cnt: "+ c1.cnt);			// 3 출력
		
		reCar.cnt = 10;									// 객체 생성하지 않음. 클래스로 접근. 즉 클래스에 선언된 static int cnt가 반응함. 
		System.out.println("c.cnt: "+ c.cnt);			
		System.out.println("c1.cnt: "+ c1.cnt);
		
		
		c1.show();
		c1.print();
		reCar.show();	// this가 없어도 가능
		//reCar.print();	// this없으면 불가
	}

}
