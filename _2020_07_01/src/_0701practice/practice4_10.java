package _0701practice;

import java.util.Scanner;

///양의 정수값 n을 읽어서 1 부터 n까지의 곱을 구하는 프로그램을 작성
public class practice4_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mul = 1;
		
		for(int i=1; i<=n; i++) {
			mul *= i;
		}
		System.out.println(mul);
		sc.close();

	}

}
