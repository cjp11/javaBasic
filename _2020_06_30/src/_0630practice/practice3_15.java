package _0630practice;

import java.util.Scanner;

public class practice3_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 세 개 입력: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int res = 0;
		
		if(a-b >= 0 && b-c <= 0) res = a;
		else if(b-a >= 0 && a-c <= 0) res = b;
		else res = c;
		
		System.out.println("중앙값: "+res);
		
		sc.close();

	}

}
