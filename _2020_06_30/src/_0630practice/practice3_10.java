package _0630practice;

import java.util.Scanner;

public class practice3_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է�: ");
		int score = sc.nextInt();
		
		if(score < 50) System.out.println("��");
		else if(score < 60) System.out.println("��");
		else if(score < 70) System.out.println("��");
		else if(score < 80) System.out.println("��");
		else System.out.println("��");
		
		sc.close();
	}

}
