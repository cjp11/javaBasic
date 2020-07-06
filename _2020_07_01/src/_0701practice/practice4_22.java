package _0701practice;

import java.util.Scanner;

/*
기호 문자 '*'를 나열해서 직각의 이등변 삼각형을 표시하는 프로그램을 작성하시오. 
실행 예
단수는?: 5
*
**
***
****
*****
단수는?: 3
*
**
***


실행 예
단수는?: 5
*****
****
***
**
*
단수는?: 3
***
**
*


*/
public class practice4_22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("단수는: ");
		int n = sc.nextInt();
		
		// 삼각형
		for(int i=0; i<n; i++) {	
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		// 역삼각형
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
		

	}

}
