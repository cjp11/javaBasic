package _0630practice;

import java.util.Scanner;

public class practice3_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("3개의 정수를 입력하시오: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int res = 0;
		
		if(a-b <= 0 && a-c <= 0) res = a;
		else if(b-a <= 0 && b-c <= 0) res = b;
		else res = c;
		
		System.out.println(res);
		
		
		sc.close();

	}

}
