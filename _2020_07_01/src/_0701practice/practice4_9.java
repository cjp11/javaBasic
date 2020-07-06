package _0701practice;

import java.util.Scanner;

//양의 정수값을 읽어서 그 자리수를 출력하는 프로그램을 작성하시오.
public class practice4_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int cnt = 0;	// 자리수
		
		while(num/10 > 0) {
			num /= 10;
			cnt++;
		}
		System.out.println((cnt+1) + "자리수입니다.");
		
		sc.close();
	}

}
