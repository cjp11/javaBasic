package _0701practice;

import java.util.Scanner;

/*
��ȣ ���� '*'�� �����ؼ� ������ �̵ �ﰢ���� ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 
���� ��
�ܼ���?: 5
*
**
***
****
*****
�ܼ���?: 3
*
**
***


���� ��
�ܼ���?: 5
*****
****
***
**
*
�ܼ���?: 3
***
**
*


*/
public class practice4_22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ܼ���: ");
		int n = sc.nextInt();
		
		// �ﰢ��
		for(int i=0; i<n; i++) {	
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		// ���ﰢ��
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
		

	}

}
