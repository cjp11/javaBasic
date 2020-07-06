package _0630practice;

import java.util.Scanner;

public class practice3_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 개의 정수를 입력: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		String res = a > b ?  "a가 b보다 크다" : ( a < b ? "b가 a보다 크다" : "a와 b는 같다");
		System.out.println(res);
		
		
		sc.close();

	}

}
