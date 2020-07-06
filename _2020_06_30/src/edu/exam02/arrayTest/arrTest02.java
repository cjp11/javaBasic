package edu.exam02.arrayTest;
// int 배열 10개 생성, 10개의 값 입력받아 순서대로 출력, 총합 출력
import java.util.Scanner;

public class arrTest02 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("10개의 정수값을 하나씩 입력하시오: ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(i + "번째 index값: ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		for(int j=0; j<arr.length; j++) {
			System.out.println(arr[j]);
		}
		System.out.println("총합: " + sum);
		
		sc.close();
	}

}
