package _0701practice;

import java.util.Scanner;

public class practice4_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		while(true) {
			int num = sc.nextInt();
			if(99 < num && num < 1000) {
				System.out.println("세자리 정수를 입력하셨습니다.");
				break;
			}
			else
				System.out.println("세자리 정수로 다시 입력해주세요");
		}
		sc.close();
	}

}
