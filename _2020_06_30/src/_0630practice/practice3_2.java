package _0630practice;

import java.util.Scanner;

public class practice3_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �ϳ� �Է�: ");
		int num = sc.nextInt();
		
		if(num < 0) System.out.println(num*(-1));
		else System.out.println(num);
		
		sc.close();
		

	}

}
