package _0701practice;

import java.util.Scanner;

public class practice4_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int start = 0;
		int dest = 0;
		
		if(a>b) {
			start = b;
			dest = a;
		}
		else {
			start = a;
			dest = b;
		}
		
		System.out.println(start + "부터 " + dest + "까지 출력하라");
		for(int i=start; i<dest+1; i++) {
			System.out.print(i + " ");
		}
		
		sc.close();
	}

}
