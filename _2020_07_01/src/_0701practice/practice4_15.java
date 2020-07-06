package _0701practice;

import java.util.Scanner;

//[문제 4-14]프로그램을 수정해서 결과뿐만 아니라 계산식까지 표시
public class practice4_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			System.out.print("sum = " + sum + " + "+ i +"\t");
			sum += i;
			
		}
		System.out.println();
		System.out.println("합: " + sum);
		sc.close();

	}

}
