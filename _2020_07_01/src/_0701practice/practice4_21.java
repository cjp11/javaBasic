package _0701practice;

import java.util.Scanner;

/*
 ��ȣ���� '*'�� �����ؼ� n���� �������� ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
���� ��
�������� ǥ���մϴ�.
�ܼ���: 3
***
***
***
�ܼ���: 5
*****
*****
*****
*****
*****
 */
public class practice4_21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ǥ���մϴ�.");
		System.out.println("�ܼ���: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();

	}

}
