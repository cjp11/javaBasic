/*	<�Է�>
 *	����?		aaaa
 *	����? 	bbbb 
 * 	��ȣ?		1111
 * 	----------------------------
 * 	<���>
 *  1,	aaaa,	bbbb,	1111,	2020-07-07,	0			/1,0,date �� ����Ʈ�� �� ������. 
 */

/*  �ϰ��� �ϴ� �� (�ݺ� �Էµǰ� �����)
 *	����?		aaaa
 *	����? 	bbbb 
 * 	��ȣ?		1111
 *  ��� �Է��Ͻðڽ��ϱ�?(y/n) y
 *  ����?		cccc
 *  ����?		dddd
 *  ��ȣ?		2222
 *  ��� �Է��Ͻðڽ��ϱ�?(y/n) n
 * 	----------------------------
 * 	<���>
 *  1,	aaaa,	bbbb,	1111,	2020-07-07,	0			/1,0,date �� ����Ʈ�� �� ������. 
 *  1,	aaaa,	bbbb,	1111,	2020-07-07,	0
 */



package ex01;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner keyScanner = new Scanner(System.in);
		
		Board board;
		board = new Board();
		System.out.print("����? ");
		board.title = keyScanner.nextLine();
		System.out.print("����? ");
		board.content = keyScanner.nextLine();
		System.out.print("��ȣ? ");
		board.password = keyScanner.nextLine();
		
		
		board.printInfo();
		keyScanner.close();
	}

}
