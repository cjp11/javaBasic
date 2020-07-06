package _0630practice;

import java.util.Scanner;

public class practice3_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 하나 입력: ");
		int num = sc.nextInt();
		
		
		if(num > 0 && num%10 == 0 ) System.out.println("이 값은 10의 배수입니다.");
		else if( num > 0 && num%10 != 0) System.out.println("이 값은 10의 배수가 아닙니다.");
		else if(num < 0) System.out.println("음의 정수값을 입력했습니다.");
		
		sc.close();

	}

}
