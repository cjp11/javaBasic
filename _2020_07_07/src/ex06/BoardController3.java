package ex06;

import java.util.Scanner;

public class BoardController3 {
	//static Scanner keyScanner = new Scanner(System.in); -> Ŭ�������� ����ϹǷ� �ϳ��� ��ġ����
	static Scanner sc;
	
	
	static Board inputBoard() {
		
		Board board = new Board();
		System.out.println("[���ߺ� �Խ���]");
		
		System.out.print("����? ");
		board.title = sc.nextLine();
		// ������ �Է� �޾� �ν��Ͻ� ���� "content"�� ����
		System.out.print("����? ");
		board.content = sc.nextLine();
		//
		System.out.print("��ȣ? ");
		board.password = sc.nextLine();	
		return board;
	}
	
	static boolean prompt() {
		// ��� �Է��� ������ ���°�
		
		System.out.println("��� �Է��Ͻðڽ��ϱ�?(y/n)");
		String answer = sc.nextLine();
		
		
		if(answer.equals("n")) return true;
		else return false;
	}
	static void printBoard(Board board) {
		System.out.println("[���ߺ� �Խ���]");
		System.out.printf("%d, %s, %s, %s, %s, %d\n", board.no, board.title, board.content, 
				board.password, board.createDate, board.viewCount);
		
	}
	
	public static void service() {
	
		
		// �Խù� �ν��Ͻ� �ּҸ� ���� �� ������ ���۷��� �迭�� �ε��� ���� ����
		Board[] boards = new Board[10];
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
		

	}

}
