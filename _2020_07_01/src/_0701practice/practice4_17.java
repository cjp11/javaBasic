package _0701practice;

import java.util.Scanner;

/*

���� ������ŭ '*'�� ǥ���ϴ� [���� 4-11]�� �����ؼ� 5 �� ������ �� �ٲ��ؼ� ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
��1) �� ���� *�� ǥ���ұ��?: 15
*****
*****
*****
��2) �� ���� *�� ǥ���ұ��?: 14
*****
*****
****

*/
public class practice4_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ���� *�� ǥ�� �ұ��: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.print("*");
			if(i%5 == 0) System.out.println();
		}
		sc.close();
	}

}
