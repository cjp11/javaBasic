package _0701practice;

import java.util.Scanner;

//1���� n������ ���� ���ϴ� ���α׷��� for���� ���

public class practice4_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		System.out.println("��: " + sum);
		sc.close();
	}

}
