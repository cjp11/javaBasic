package _0630practice;

import java.util.Scanner;

public class practice3_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �ϳ� �Է�: ");
		int num = sc.nextInt();
		
		
		if(num > 0 && num%10 == 0 ) System.out.println("�� ���� 10�� ����Դϴ�.");
		else if( num > 0 && num%10 != 0) System.out.println("�� ���� 10�� ����� �ƴմϴ�.");
		else if(num < 0) System.out.println("���� �������� �Է��߽��ϴ�.");
		
		sc.close();

	}

}
