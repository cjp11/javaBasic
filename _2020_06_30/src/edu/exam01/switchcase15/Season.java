package edu.exam01.switchcase15;

import java.util.Scanner;
// case�� ������� ������ ����(���ͷ�)
public class Season {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		int num = sc.nextInt();
		// case ���� ��� �� ���;���. ���� �̸��� ������ �ȵ�. final int a = 10 , �� ����� ����� case a�� ���� 
		switch(num) {
		case 0:	System.out.println("��");			// break�� ���ٸ� 0�����̽��� �ڵ带 �����ϰ� case 1 ���ǿ� ������� case 1�� ������ ������.
		case 1:	System.out.println("����"); break;	// �� case 1�� break�� ������ ��������. 	
		case 2:	System.out.println("����"); break;
		case 3:	System.out.println("�ܿ�"); break;
		default: System.out.println("�ش���� ����");
		}
		
		switch(num) {
		case 12:
		case 1:
		case 2:
			System.out.println("�ܿ�"); break;
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
		default:
			System.out.println("�ش���� ����"); break;
			
		}
		System.out.println("������ �ѱ۷� �Է�: ");
		String season = sc.next();
		
		switch(season) {
		case "��": System.out.println("spring");break;
		case "����": System.out.println("summer");break;
		case "����": System.out.println("autumn");break;
		case "�ܿ�": System.out.println("winter");break;
		default: System.out.println("winter"); break;
		
		
		} */
		// char���� ���������� 2���� �Ѿ�� 
		char input = sc.next().charAt(0);	// next()�� string������ �޾Ƶ���. �׷��� �ణ�� ������ �ʿ�
											// cahrAt(0)�� ����ϸ� ����  string�� ù��° ���� �������°�.
		System.out.println(input);
		
		switch(input) {
		case '��': System.out.println("spring");break;
		case '��': System.out.println("summer");break;
		case '��': System.out.println("autumn");break;
		case '��': System.out.println("winter");break;
		default: System.out.println("�ش����"); break;
		}
		sc.close();

	}

}
