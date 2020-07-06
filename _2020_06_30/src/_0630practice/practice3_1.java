package _0630practice;

import java.util.Scanner;

public class practice3_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요: ");
		int num = sc.nextInt(); 
		if(num<0) System.out.println("이 값은 음의 값입니다");
		
		sc.close();
	}

}
