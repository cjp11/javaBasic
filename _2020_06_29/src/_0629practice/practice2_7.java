package _0629practice;

import java.util.Scanner;

public class practice2_7 {

	public static void main(String[] args) {
		int a = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 하나 입력: ");
		a = sc.nextInt();
		
		System.out.println(a/10);
		System.out.println(a%10);
		
		sc.close();
	}

}
