package _0701practice;

import java.util.Scanner;

/*
 * 입력한 정수값의 모든 약수와 그 개수를 표시하는 프로그램을 작성하시오.
	실행의 예
	정수값: 12
	1 2 3 4 6 12
	의 약수는 6개입니다.

 */
public class practice4_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수값 입력: ");
		int n = sc.nextInt();
		int cnt = 0;
		
		for(int i=1; i<=n; i++) {
			if(n%i == 0) {
				System.out.print(i+ " ");
				cnt++;
			}
		}
		System.out.println();
		System.out.println(n + "의 약수는 " + cnt +"개 입니다.");
		sc.close();
	}

}
