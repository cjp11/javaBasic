package _0629practice;

import java.util.Scanner;

public class practice2_8 {

	public static void main(String[] args) {
		double a = 0, b = 0;
		double sum = 0, avg = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�Ǽ� �� �� �Է�: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		
		sum = a + b;
		avg = sum / 2;
		
		System.out.println("��: "+  sum + " ���: " + avg);
		sc.close();

	}

}
