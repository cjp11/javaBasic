package edu.exam03.method03;

import java.util.Scanner;

public class Method01 {
	public static Scanner sc = new Scanner(System.in);
	public static int[] input() {
		
		int arr[];
		int cnt = 0;
		System.out.println("몇 개의 인자를 입력할까요: ");
		cnt = sc.nextInt();
		arr = new int[cnt];
		
		for(int i=0; i<cnt; i++) {
			System.out.println("인자값 입력: ");
			arr[i] = sc.nextInt();
		}
		
		return arr;
	}
	public static int add(int[] brr) {
		int sum = 0;
		for(int i=0; i<brr.length; i++) {
			sum += brr[i];
		}
		return sum;
	}
	public static void output(int result) {
		System.out.println("합: " + result);
	}
	
	public static void main(String[] args) {
		int res = 0;
		int[] arr;
		arr = input();
		res = add(arr);
		output(res);
		
		sc.close();
	}

}
