package _0629practice;

import java.util.Scanner;

public class practice2_10 {

	public static void main(String[] args) {
		int r = 0;
		double pi = 3.14;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �������� �Է��Ͻÿ�: ");
		r = sc.nextInt();
		
		System.out.println("���� ����: "+4*pi*r*r+" ���� �ѳ���: "+4/3*pi*r*r*r);
		
		sc.close();

	}

}
