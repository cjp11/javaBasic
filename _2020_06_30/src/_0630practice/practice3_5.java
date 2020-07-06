package _0630practice;

import java.util.Scanner;

public class practice3_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 하나 입력: ");
		
		int num = sc.nextInt();
		if(num>0) System.out.println("양수");
		else if(num<0) System.out.println("음수");
		else System.out.println("0(숫자)");
		
		
		sc.close();
		

	}

}
