package _0701practice;

import java.util.Scanner;

/*
 * �Է��� �������� ��� ����� �� ������ ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	������ ��
	������: 12
	1 2 3 4 6 12
	�� ����� 6���Դϴ�.

 */
public class practice4_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է�: ");
		int n = sc.nextInt();
		int cnt = 0;
		
		for(int i=1; i<=n; i++) {
			if(n%i == 0) {
				System.out.print(i+ " ");
				cnt++;
			}
		}
		System.out.println();
		System.out.println(n + "�� ����� " + cnt +"�� �Դϴ�.");
		sc.close();
	}

}
