package _0630practice;

import java.util.Scanner;

public class practice3_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� ������ �Է��Ͻÿ�");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a%b == 0) System.out.println("B�� A�� ����̴�.");
		else System.out.println("B�� A�� ����� �ƴϴ�. ");
		
		sc.close();

	}

}
