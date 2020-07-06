package step01;

public class Exam04 {
	// 1) call by value : 매서드 실행 시, 값을 넘김
	static void m(int a) {
		a = 20;
	}
	
	// 2) call by reference : 매서드를 실행 시, 주소를 넘김.
	static void m2(int[] arr) {
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 90;
	}
	
	public static void main(String[] args) {
		// 1)예
		int a = 10;
		m(a);
		System.out.println(a);
		System.out.println("----------");
		
		// 2)예
		int[] arr = {0,0,0};
		m2(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		

	}

}
