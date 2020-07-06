package edu.exam02.arrayTest;
// 정수 10개 입력받아 저장하고 
// 이 중 2와 3의 배수를 출력
import java.util.Scanner;

public class arrTest04 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("10 개의 정수를 입력하시오");
		for(int i=0; i<arr.length; i++) {
			System.out.println(i + "번째 index값: ");
			arr[i] = sc.nextInt();
		}
		for(int j=0; j<arr.length; j++) {
			if(arr[j]%2 == 0 || arr[j]%3 == 0) System.out.println(arr[j]);
		}
		sc.close();
		

	}

}
