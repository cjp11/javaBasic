package _0701practice;

import java.util.Scanner;

/*

읽은 개수만큼 '*'를 표시하는 [문제 4-11]을 변경해서 5 개 단위로 줄 바꿈해서 표시하는 프로그램을 작성하시오.
예1) 몇 개의 *을 표시할까요?: 15
*****
*****
*****
예2) 몇 개의 *을 표시할까요?: 14
*****
*****
****

*/
public class practice4_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 개의 *을 표시 할까요: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.print("*");
			if(i%5 == 0) System.out.println();
		}
		sc.close();
	}

}
