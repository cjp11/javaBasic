package edu.exam03.method01;

import java.util.Scanner;

public class MethodDef {
	
	public static int getAge() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ��ħ�Դϴ�.");
		System.out.print("���̴� ��� �Ǽ���? ");
		int age = 0;
		age = sc.nextInt();
		sc.close();
		return age;
	}
	
	public static void greeting(int age) {
		
		
		//while(true) {	 for( ; ; ) �� ���� �ʱ�, ������ ���� ������ �׻� ���̵�
			
			if(age > 40) {
				System.out.println("�ȳ��ϼ���");
			}
			else if(age > 30) {
				System.out.println("�ݰ� �ݰ�");
			}
			else if(age > 20) {
				System.out.println("�ȳ�");
			}
			else if(age > 10) {
				System.out.println("����");
			}
			
				

		
		
	}
	
	public static void main(String[] args) {
		int age = 0;
		age = getAge();
		greeting(age);
		
		/* �Ʒ� �ڵ带 �״�� �Լ��� �Ű��ش�
		Scanner sc = new Scanner(System.in);
		
		while(true) {	// for( ; ; ) �� ���� �ʱ�, ������ ���� ������ �׻� ���̵�
			System.out.println("���� ��ħ�Դϴ�.");
			System.out.print("���̴� ��� �Ǽ���? ");
			int age = 0;
		
			age = sc.nextInt();
			if(age > 40) {
				System.out.println("�ȳ��ϼ���");
			}
			else if(age > 30) {
				System.out.println("�ݰ� �ݰ�");
			}
			else if(age > 20) {
				System.out.println("�ȳ�");
			}
			else if(age > 10) {
				System.out.println("����");
			}
			else if(age <= 0)
				break;

		}
		sc.close();
		*/
	

	}
}
