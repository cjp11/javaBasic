package _0630practice;

import java.util.Scanner;

public class practice3_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �ϳ� �Է�: ");
		int num = sc.nextInt();
		
		if(num > 0 && num%3 == 0 ) System.out.println("�� ���� 3���� ���������ϴ�.");
		else if( num > 0 && num%3 == 1) System.out.println("�� ���� 3���� ���� �������� 1�Դϴ�");
		else if(num > 0 && num%3 == 2) System.out.println("�� ���� 3���� ���� �������� 2�Դϴ�");
		else if(num < 0) System.out.println("����� �ƴ� ���� �Է��߽��ϴ�.");
		
		sc.close();

	}

}
