package _0630practice;

import java.util.Scanner;

public class practice3_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~12�� ���ڸ� �Է��Ͻÿ�");
		int season = sc.nextInt();
		
		switch(season) {
		case 3:
		case 4:
		case 5:
			System.out.println("��"); break;
		case 6:
		case 7:
		case 8:
			System.out.println("����"); break;
		case 9:
		case 10:
		case 11:
			System.out.println("����"); break;
		case 12:
		case 1:
		case 2:
			System.out.println("�ܿ�"); break;
		default:
			System.out.println("���ڸ� �߸� �Է��ϼ̽��ϴ�.");
				
		}
		
		sc.close();

	}

}
