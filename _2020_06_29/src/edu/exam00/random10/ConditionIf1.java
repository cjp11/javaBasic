package edu.exam00.random10;

import java.util.Scanner;

public class ConditionIf1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) System.out.println("¦��");
		else
			System.out.println("Ȧ��");
		
		sc.close();

	}

}
