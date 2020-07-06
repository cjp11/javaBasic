package _0701practice;

import java.util.Scanner;

//1부터 n까지의 합을 구하는 프로그램을 for문을 사용

public class practice4_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		System.out.println("합: " + sum);
		sc.close();
	}

}
