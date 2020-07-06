package _0630practice;

import java.util.Scanner;

public class practice3_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 하나 입력: ");
		int num = sc.nextInt();
		
		if(num%5 == 0) System.out.println("이 값은 5로 나누어 떨어집니다.");
		else System.out.println("이 값은 5로 나누어지지 않습니다.");
		
		sc.close();

	}

}
