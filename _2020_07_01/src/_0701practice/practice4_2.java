package _0701practice;

import java.util.Scanner;

public class practice4_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		while(true) {
			int num = sc.nextInt();
			if(99 < num && num < 1000) {
				System.out.println("���ڸ� ������ �Է��ϼ̽��ϴ�.");
				break;
			}
			else
				System.out.println("���ڸ� ������ �ٽ� �Է����ּ���");
		}
		sc.close();
	}

}
