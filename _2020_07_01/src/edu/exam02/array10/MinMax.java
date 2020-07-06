package edu.exam02.array10;

import java.util.Arrays;
import java.util.Scanner;

// 5개의 정수 입력받고
// 최소값 최대값을 구해서 출력하세요.

public class MinMax {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("5개 정수 입력: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("최소값: "+arr[0]);
		System.out.println("최대값: "+arr[arr.length-1]);
		
		sc.close();
		
	}

}
