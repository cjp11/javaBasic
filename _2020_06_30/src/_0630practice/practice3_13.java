package _0630practice;

import java.util.Scanner;

public class practice3_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ���� ���� �Է�: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int res = a > b ? (a-b) : ( a < b ? (-1)*(a-b) : (a-b) ); // ���� ó�����ַ��� ���.
																  // res�� |a-b| ����� ����
		
		if(res <= 10) System.out.println("�� ���� ���� 10 �����Դϴ�");
		else	System.out.println("�� ���� ���� 11 �̻��Դϴ�");
		
		sc.close();

	}

}
