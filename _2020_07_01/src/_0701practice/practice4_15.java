package _0701practice;

import java.util.Scanner;

//[���� 4-14]���α׷��� �����ؼ� ����Ӹ� �ƴ϶� ���ı��� ǥ��
public class practice4_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			System.out.print("sum = " + sum + " + "+ i +"\t");
			sum += i;
			
		}
		System.out.println();
		System.out.println("��: " + sum);
		sc.close();

	}

}
