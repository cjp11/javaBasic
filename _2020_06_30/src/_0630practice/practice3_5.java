package _0630practice;

import java.util.Scanner;

public class practice3_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ϳ� �Է�: ");
		
		int num = sc.nextInt();
		if(num>0) System.out.println("���");
		else if(num<0) System.out.println("����");
		else System.out.println("0(����)");
		
		
		sc.close();
		

	}

}
