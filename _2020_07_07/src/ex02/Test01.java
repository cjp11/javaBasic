package ex02;

import java.util.Scanner;

/*
 * �̸�? ȫ�浿
 * ��ȭ? 010-1111-1111
 * �̸���? hong@test.com
 * ȸ��?	��Ʈķ��
 * ����?	�븮
 * ��� �Է��Ͻðڽ��ϱ�?(y/n)
 * --------------------------
 * �̸�? �Ӳ���
 * ��ȭ? 010-2222-2222
 * �̸���? lim@test.com
 * ȸ��?	��Ʈķ��
 * ����?	���
 * ��� �Է��Ͻðڽ��ϱ�?(y/n)
 */
public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Contact ct = new Contact();
		System.out.print("�̸�? ");
		ct.name = sc.nextLine();
		System.out.print("��ȭ? ");
		ct.phone = sc.nextLine();
		System.out.print("�̸���? ");
		ct.email = sc.nextLine();
		System.out.print("ȸ��? ");
		ct.company = sc.nextLine();
		System.out.print("����? ");
		ct.position = sc.nextLine();
		
		System.out.println(ct.name);
		System.out.println(ct.phone);
		System.out.println(ct.email);
		System.out.println(ct.company);
		System.out.println(ct.position);
		
		
		sc.close();
	}

}
