package ex05;
// ex06 �� ���׷��̵� ���� 
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


/* ���� ���� ��ǥ, �Ʒ� �ּ��� ó�� ���ٽ� 
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
		// new�� �� ���� ���ش�. �ٸ� Ŭ�������� �ݺ������� ���� �ʾƵ� ��. sc�� �ּҰ��� �Ѱ��ָ� �ȴ�.  
		Scanner sc = new Scanner(System.in);
		BoardController.sc = sc;
		//BoardController2.sc = sc;
		//BoardController3.sc = sc;
		ContactController.sc = sc;
		
		BoardController board1 = new BoardController("���� �Խ���");
		BoardController board2 = new BoardController("������ �Խ���");
		BoardController board3 = new BoardController("���ߺ� �Խ���");
		ContactController contact1 = new ContactController("���� ����ó");
		ContactController contact2 = new ContactController("�� ����ó");
	
		
		
		while(true) {
			
			System.out.println("[�޴�]");
			System.out.println("1. ���� �Խ���");
			System.out.println("2. ������ �Խ���");
			System.out.println("3. ���ߺ� �Խ���");
			System.out.println("4. ���� ����ó");
			System.out.println("5. �� ����ó");
			System.out.println("0. ����");
			System.out.println("----------------");			
			System.out.print("�޴� ��ȣ�� �Է��ϼ���> ");
			
			//int menuNum = sc.nextInt();		// int�� ���� ������ ����? ����? �̷��� ���ٿ� �� ���� ��µ�		
											// String���� �޾ƾ� ������ �ȳ�. 
			String menuNum = sc.nextLine();
			
			if(menuNum.equals("1")) {
				board1.service();
				//System.out.println("�Խ���");
				continue;
			}
			else if(menuNum.equals("2")) {
				board2.service();
				//System.out.println("����ó");
				continue;
			}
			else if(menuNum.equals("3")) {
				board3.service();
				continue;
			}
			else if(menuNum.equals("4")) {
				contact1.service();
				continue;
			}
			else if(menuNum.equals("5")) {
				contact2.service();
				continue;
			}
			else if(menuNum.equals("0")) {
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
