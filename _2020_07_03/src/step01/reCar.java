package step01;

public class reCar {
	static int cnt = 0;		// int cnt / static int  비교하기 
	public static int a = 0;
	public static int b = 0;
	
	reCar() {
		System.out.println("reCar()");
	}
	
	static public void show() {					//  static int a,b 로 선언하지 않았으므로 
												// 객체를 생성하지 않았다면 print(~~a,~~b)안에 있는 a,b가 인식되지 않는다.
												// static public int a,b로 선언하면 a,b를 인식할 수 있다. 객체 생성하지 않아도 되므로
		System.out.println("a: " + a + "b: "+ b);
	}
	public void print() {		
		System.out.println("a: " + a + "b: "+ b);	
	}
	
}
