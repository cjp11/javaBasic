package ex03;

import java.util.Scanner;

/*
 * [�޴�]
 * 1. �Խ���
 * 2. ����ó
 * 3. ����
 * -----------------------
 * �޴� ��ȣ�� �Է��ϼ���> 1
 * [���� > �Խ���] 
 * ����? aaa
 * ����? bbb
 * ��ȣ? 1111
 * ��� �Է��Ͻðڽ��ϱ�?(y/n) n
 * [���� > �Խ���]
 * 1, aaa, bbb, 1111, 2020-07-07, 0					
 * 
 * �޴� ��ȣ�� �Է��ϼ���> 2
 * [���� > ����ó]
 * �̸�? ȫ�浿
 * ��ȭ? 010
 * �̸���? hong@test.com
 * ȸ��? ��Ʈ
 * ����? �븮
 * ��� �Է��Ͻðڽ��ϱ�?(y/n) n
 * [���� > ����ó]
 * ȫ�浿, 010, hong@test.com, ��Ʈ, �븮 
 */
/*
[�޴�]
* 1. �Խ���
* 2. ����ó
* 0. ����
* -----------------
* �޴� ��ȣ�� �Է��ϼ��� > 1
* �Խ���
* [�޴�]
* 1. �Խ���
* 2. ����ó
* 0. ����
* ------------------
* �޴� ��ȣ�� �Է��ϼ��� > 2
* ����ó
* [�޴�]
* 1. �Խ���
* 2. ����ó
* 0. ����
* ------------------
* �޴� ��ȣ�� �Է��ϼ��� > 3
* �ش� �޴��� �����ϴ�.
* [�޴�]
* 1. �Խ���
* 2. ����ó
* 0. ����
* ------------------
* �޴� ��ȣ�� �Է��ϼ��� >
* 
* 
*/
public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		
		
		while(true) {
			
			System.out.println("[�޴�]");
			System.out.println("1. �Խ���");
			System.out.println("2. ����ó");
			System.out.println("0. ����");
			System.out.println("----------------");			
			System.out.print("�޴� ��ȣ�� �Է��ϼ���> ");
			
			int menuNum = sc.nextInt();
			if(menuNum == 1) {
				Test04.main(null);
				//System.out.println("�Խ���");
				continue;
			}
			else if(menuNum == 2) {
				Test02.main(null);
				//System.out.println("����ó");
				continue;
			}
			else if(menuNum == 0) {
				System.out.println("����");
				break;
			}
			else {
				System.out.println("�ش� �޴��� �����ϴ�.");
				continue;
			}
			
		}
		sc.close();

	}

}