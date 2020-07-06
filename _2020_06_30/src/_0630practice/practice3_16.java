package _0630practice;

import java.util.Scanner;

public class practice3_16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 개의 정수 입력: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int res = a > b ? a : ( a < b ? b : -1);
		
		if(res == -1) System.out.println("두 값이 같습니다.");
		else System.out.println(res); // 큰 값 출력.
		
		sc.close();
	}
}
