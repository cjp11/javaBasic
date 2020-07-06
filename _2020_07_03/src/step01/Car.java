package step01;

public class Car {
	static int cnt = 0;
	public int a = 0;
	Car() {
		cnt++;
		System.out.println("Car()");
	}
	public static void show() {
		System.out.println("cnt: " + cnt);
	}
	public void print() {
		System.out.println("cnt: " + cnt);
	}
}
