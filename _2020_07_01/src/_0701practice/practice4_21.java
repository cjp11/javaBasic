package _0701practice;

import java.util.Scanner;

/*
 기호문자 '*'를 나열해서 n단의 정방형을 표시하는 프로그램을 작성하시오.
실행 예
정방형을 표시합니다.
단수는: 3
***
***
***
단수는: 5
*****
*****
*****
*****
*****
 */
public class practice4_21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정방형을 표시합니다.");
		System.out.println("단수는: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();

	}

}
