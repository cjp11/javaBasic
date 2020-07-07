package ex01;

import java.util.Scanner;

public class Test04 {
	static Scanner keyScanner = new Scanner(System.in);
	
	
	static Board02 inputBoard() {
		
		Board02 board = new Board02();
		
		System.out.print("����? ");
		board.title = keyScanner.nextLine();
		// ������ �Է� �޾� �ν��Ͻ� ���� "content"�� ����
		System.out.print("����? ");
		board.content = keyScanner.nextLine();
		//
		System.out.print("��ȣ? ");
		board.password = keyScanner.nextLine();	
		return board;
	}
	
	static boolean prompt() {
		// ��� �Է��� ������ ���°�
		
		System.out.println("��� �Է��Ͻðڽ��ϱ�?(y/n)");
		String answer = keyScanner.nextLine();
		
		
		if(answer.equals("n")) return true;
		else return false;
	}
	static void printBoard(Board02 board) {
		System.out.printf("%d, %s, %s, %s, %s, %d\n", board.no, board.title, board.content, 
				board.password, board.createDate, board.viewCount);
		
	}
	
	public static void main(String[] args) {
	
		
		// �Խù� �ν��Ͻ� �ּҸ� ���� �� ������ ���۷��� �迭�� �ε��� ���� ����
		Board02[] boards = new Board02[10];
		int i = 0;
		
		
		// �Խù� ������ �Է� �޴� �ڵ带 �ݺ� ����
		while(i<10) {
			// �Խù� ������ ���� �� ���� �ν��Ͻ��� ���ۼ��� ����
			boards[i] = inputBoard();
			i++;
			
			if(prompt()) break;
			
		}
		for(int j=0; j<i; j++) {
			printBoard(boards[j]);
		}
	
		//boards.printInfo();
		keyScanner.close();

	}

}
