package _0630practice;

import java.util.Scanner;

public class practice3_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �ϳ� �Է�: ");
		int num = sc.nextInt();
		
		if(num%5 == 0) System.out.println("�� ���� 5�� ������ �������ϴ�.");
		else System.out.println("�� ���� 5�� ���������� �ʽ��ϴ�.");
		
		sc.close();

	}

}
