package _0701practice;

import java.util.Scanner;

///���� ������ n�� �о 1 ���� n������ ���� ���ϴ� ���α׷��� �ۼ�
public class practice4_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mul = 1;
		
		for(int i=1; i<=n; i++) {
			mul *= i;
		}
		System.out.println(mul);
		sc.close();

	}

}
