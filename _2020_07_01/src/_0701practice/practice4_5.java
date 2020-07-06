package _0701practice;

import java.util.Scanner;

//입력 받은 정수부터 0까지 카운트 다운 (음수 입력시 양수 입력시까지 계속 입력 받는다)
public class practice4_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			int num = sc.nextInt();
			if(num >= 0) {
				for(int i=num; i>=0; ) {
					System.out.print((--i) + " ");
				}
				break;
			}
			else {
				System.out.println("양수를 입력해주세요");
			}
		}
		
		sc.close();
	}

}
