package _0701practice;

import java.util.Scanner;

public class practice4_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ݺ� Ƚ�� �Է�: ");
		int cnt = sc.nextInt();
		for(int i=0; i<cnt; i++) {
			System.out.println("���� �ϳ� �Է�: ");
			int num = sc.nextInt();
			if(num>0) System.out.println("���");
			else if(num<0) System.out.println("����");
			else System.out.println("0(����)");
		}
		System.out.println(cnt+"�� ��ŭ �ݺ��Ͽ���.");
		sc.close();

	}

}
