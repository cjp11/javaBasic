package _0701practice;

import java.util.Scanner;

/*
 n�� �Ƕ�̵带 ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	���� ��
	�ܼ���? : 5
	 *
    ***
   *****
  *******
 *********
 */
public class practice4_23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ܼ���: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int k=0; k<n-i-1; k++) {
				System.out.print(" ");
			}
			
			for(int j=0; j<2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
