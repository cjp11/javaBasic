package _0630practice;

import java.util.Scanner;

public class practice3_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력: ");
		int score = sc.nextInt();
		
		if(score < 50) System.out.println("가");
		else if(score < 60) System.out.println("양");
		else if(score < 70) System.out.println("미");
		else if(score < 80) System.out.println("우");
		else System.out.println("수");
		
		sc.close();
	}

}
