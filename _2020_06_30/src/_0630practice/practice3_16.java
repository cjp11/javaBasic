package _0630practice;

import java.util.Scanner;

public class practice3_16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ���� ���� �Է�: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int res = a > b ? a : ( a < b ? b : -1);
		
		if(res == -1) System.out.println("�� ���� �����ϴ�.");
		else System.out.println(res); // ū �� ���.
		
		sc.close();
	}
}
