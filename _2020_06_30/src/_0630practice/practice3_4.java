package _0630practice;

import java.util.Scanner;

public class practice3_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 개의 정수를 입력하시오");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a%b != 0) System.out.println("B는 A의 약수가 아니다.");
		else System.out.println("B는 A의 약수이다. ");
		
		sc.close();

	}

}
