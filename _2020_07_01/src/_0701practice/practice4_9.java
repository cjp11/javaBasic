package _0701practice;

import java.util.Scanner;

//���� �������� �о �� �ڸ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
public class practice4_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int cnt = 0;	// �ڸ���
		
		while(num/10 > 0) {
			num /= 10;
			cnt++;
		}
		System.out.println((cnt+1) + "�ڸ����Դϴ�.");
		
		sc.close();
	}

}
