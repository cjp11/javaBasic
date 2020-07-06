package _0630practice;

import java.util.Scanner;

public class practice3_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		
		System.out.println("3개의 정수 입력");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		// 정렬
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j+1] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}
		}
		// 오름차순 정렬된 배열 출력
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();

	}

}
