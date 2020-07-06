package _0701practice;

import java.util.Scanner;

public class practice4_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("반복 횟수 입력: ");
		int cnt = sc.nextInt();
		for(int i=0; i<cnt; i++) {
			System.out.println("정수 하나 입력: ");
			int num = sc.nextInt();
			if(num>0) System.out.println("양수");
			else if(num<0) System.out.println("음수");
			else System.out.println("0(숫자)");
		}
		System.out.println(cnt+"번 만큼 반복하였음.");
		sc.close();

	}

}
