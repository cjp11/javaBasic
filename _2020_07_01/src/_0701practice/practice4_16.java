package _0701practice;

import java.util.Scanner;

/*
 * 신장별 표준 체중 대응표를 표시하는 프로그램을 작성하시오. 표시할 신장의 범위(시작값/종료값/증가값)는
     정수값을 입력받을 것.
 * 표준 체중 = ( 신장 - 100) x 0.9

	실행의 예
	몇 cm부터: 150
	몇 cm까지: 180
	몇 cm단위: 5

	신장 표준 체중
	-----------
	150  45.0
	155  49.5
	...
	180  72.0
 * 
 * 
 * 
 */
public class practice4_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("신장범위(시작값/종료값/증가값)을 정수값으로 차례대로 입력하시오");
		int start = sc.nextInt();
		int end = sc.nextInt();
		int inc = sc.nextInt();
		
		System.out.println("몇 cm부터: " + start);
		System.out.println("몇 cm까지: " + end);
		System.out.println("몇 cm단위: " + inc);
		
		System.out.println("신장\t" + "표준 체중");
		System.out.println("----------------");
		int n = (end - start)/inc + 1;
		//System.out.println(n);
		for(int i=0; i<n; i++) {
			System.out.println((start+i*inc) + "\t" + ((start+i*inc) - 100)*0.9);
		}
		
		sc.close();

	}

}
