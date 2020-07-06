package _0630practice;

import java.util.Scanner;

public class practice3_17 {

	public static void main(String[] args) {
		int[] arr = new int[2];
		Scanner sc = new Scanner(System.in);
		System.out.println("두 개의 정수 입력: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		// 정렬
		int temp = 0;
		if(arr[0] < arr[1]) {
			temp = arr[0];
			arr[0] = arr[1];
			arr[1] = temp;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("배열의 "+i+ "번째 index 값: "+arr[i]);
		}
		
		sc.close();
	}

}
