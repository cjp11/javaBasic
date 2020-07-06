package _0701practice;

import java.util.Scanner;

/*
 n단의 숫자 피라미드를 표시하는 프로그램을 작성하시오.
실행 예
단수는: 5
     1
    222
   33333
  4444444
 555555555

단수는: 12
           1
          222
         33333
        4444444
       555555555
      66666666666
     7777777777777
    888888888888888
   99999999999999999
  0000000000000000000
 111111111111111111111
22222222222222222222222
 */
public class practice4_24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("단수는: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int k=0; k<n-i-1; k++) {
				System.out.print(" ");
			}
			
			for(int j=0; j<2*i+1; j++) {
				System.out.print(i+1);
			}
			System.out.println();
		}
		
		sc.close();

	}

}
