package ex01;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner keyScanner = new Scanner(System.in);
		
		// �Խù� �ν��Ͻ� �ּҸ� ���� �� ������ ���۷��� �迭�� �ε��� ���� ����
		Board02[] boards = new Board02[10];
		int i = 0;
		
		// �ݺ������� �����ϴ� ������ �ݺ��� �ۿ� ����
		Board02 board;
		String answer;
		
		// �Խù� ������ �Է� �޴� �ڵ带 �ݺ� ����
		while(i<10) {
			// �Խù� ������ ���� �� ���� �ν��Ͻ��� ���ۼ��� ����
			board = new Board02();
			// ������ �Է� �޾� �ν��Ͻ� ���� "title"�� ����
			System.out.print("����? ");
			board.title = keyScanner.nextLine();
			// ������ �Է� �޾� �ν��Ͻ� ���� "content"�� ����
			System.out.print("����? ");
			board.content = keyScanner.nextLine();
			//
			System.out.print("��ȣ? ");
			board.password = keyScanner.nextLine();		
			//
			boards[i] = board;
			i++;
			
			answer = keyScanner.nextLine();
			System.out.println("��� �Է��Ͻðڽ��ϱ�?(y/n)");
			
			
			if(answer.equals("n")) break;
			
		}
	
		//boards.printInfo();
		keyScanner.close();

	}

}
