package _0701practice;

import java.util.Scanner;

/*
 n단 피라미드를 표시하는 프로그램을 작성하시오.
	실행 예
	단수는? : 5
	 *
    ***
   *****
  *******
 *********
 */
public class practice4_23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("단수는: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int k=0; k<n-i-1; k++) {
				System.out.print(" ");
			}
			
			for(int j=0; j<2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
