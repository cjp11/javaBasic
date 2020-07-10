package step01.ex01;

public class Calc3 extends Calc{
	void plus(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			result += arr[i];
		}
	}
	
	void plus(int a, int b) {
		result += a;
		result += b;
	}
	
	
}
