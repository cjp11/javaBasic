package step01.ex01;

public class Calc2 extends Calc {
	void plusArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			this.result += arr[i];
		}
	}
	void plusTwin(int a, int b) {
		result += a;
		result += b;
	}
}
