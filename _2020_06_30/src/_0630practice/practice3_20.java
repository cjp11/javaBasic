package _0630practice;

import java.util.Scanner;

public class practice3_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~12의 숫자를 입력하시오");
		int season = sc.nextInt();
		
		switch(season) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄"); break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름"); break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을"); break;
		case 12:
		case 1:
		case 2:
			System.out.println("겨울"); break;
		default:
			System.out.println("숫자를 잘못 입력하셨습니다.");
				
		}
		
		sc.close();

	}

}
