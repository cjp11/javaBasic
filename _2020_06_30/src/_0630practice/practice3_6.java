package _0630practice;

import java.util.Scanner;

public class practice3_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� ������ �Է�: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		String res = a > b ?  "a�� b���� ũ��" : ( a < b ? "b�� a���� ũ��" : "a�� b�� ����");
		System.out.println(res);
		
		
		sc.close();

	}

}
