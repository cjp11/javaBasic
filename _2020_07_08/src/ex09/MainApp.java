package ex09;
// ex06 �� ���׷��̵� ���� 
import java.util.Scanner;

/* ���� > 1
	����/���� �Խ��� > list
	1, aaa, bbb, 1111, 2020_07_08, 0
	2, ccc, ddd, 2222, 2020_07_08, 0
	3, eee, fff, 3333, 2020_07_08, 0

	����/���� �Խ��� > add
	����? ###
	����? ####
	��ȣ? ######
	�����Ͻðڽ��ϱ�?(y/n) y
	�����Ͽ����ϴ�.
	����/���� �Խ���> detail
	��ȣ? 1
	����: aaa
	����: bbb
	��ȣ: 1111
	�����: 2020_07_08
	��ȸ��: 0
	����/���� �Խ���> delete
	��ȣ? 2
	���� �����Ͻðڽ��ϱ�?(y/n) y
	���� �Ǿ����ϴ�.
	����/���� �Խ���> list
	1, aaa, bbb, 1111, 2020_07_08, 0
	3, eee, fff, 3333, 2020_07_08, 0
	����/���� �Խ���> update
	��ȣ? 1
	����(aaa)? ggg
	����(bbb)? hhh
	�����Ͻðٽ��ϱ�? (y/n) y
	�����Ͽ����ϴ�
	����/���� �Խ���> list
	1, ggg, hhh, 1111, 2020_07_08, 0
	3, eee, fff, 3333, 2020_07_08, 0
	����/���� �Խ���> main
	(������ �����ϰ� ���� ȭ������ �̵�)
*/


public class MainApp {

	public static void main(String[] args) {
		// new�� �� ���� ���ش�. �ٸ� Ŭ�������� �ݺ������� ���� �ʾƵ� ��. sc�� �ּҰ��� �Ѱ��ָ� �ȴ�.  
		Scanner sc = new Scanner(System.in);
		BoardController.sc = sc;
		//BoardController2.sc = sc;
		//BoardController3.sc = sc;
		ContactController.sc = sc;
		MemberController.sc = sc;
		
		BoardController board1 = new BoardController("���� �Խ���");
		BoardController board2 = new BoardController("������ �Խ���");
		BoardController board3 = new BoardController("���ߺ� �Խ���");
		ContactController contact1 = new ContactController("���� ����ó");
		ContactController contact2 = new ContactController("�� ����ó");
	
		MemberController member1 = new MemberController();
		
		
		while(true) {
			
			System.out.println("[�޴�]");
			System.out.println("1. ���� �Խ���");
			System.out.println("2. ������ �Խ���");
			System.out.println("3. ���ߺ� �Խ���");
			System.out.println("4. ���� ����ó");
			System.out.println("5. �� ����ó");
			System.out.println("6. ȸ��");
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
			else if(menuNum.equals("6")) {
				member1.service();
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
