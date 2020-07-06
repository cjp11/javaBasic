package step01.ex01;

public class Test01 {
	static int minus(int a, int b) {
		return a - b;
	}
	static int plus(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		// °è»ê: 3 - 5 + 7 + 2 = ?
		int result = minus(3,5);
		result = plus(result,7);
		result = plus(result,2);
		System.out.println(result);
	}
}
