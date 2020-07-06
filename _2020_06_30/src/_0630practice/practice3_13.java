package _0630practice;

import java.util.Scanner;

public class practice3_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 개의 정수 입력: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int res = a > b ? (a-b) : ( a < b ? (-1)*(a-b) : (a-b) ); // 절댓값 처리해주려고 사용.
																  // res는 |a-b| 결과가 저장
		
		if(res <= 10) System.out.println("두 값의 차는 10 이하입니다");
		else	System.out.println("두 값의 차는 11 이상입니다");
		
		sc.close();

	}

}
