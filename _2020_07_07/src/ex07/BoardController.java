package ex07;

import java.util.Scanner;

public class BoardController {
	//static Scanner keyScanner = new Scanner(System.in); -> Ŭ�������� ����ϹǷ� �ϳ��� ��ġ����
	static Scanner sc;
	
	Board[] boards = new Board[10];
	int i = 0;
	int j = 0;
	String boardName;	// �Խ��Ǹ��� �̸��� �޶�� �ϱ� ������ �ν��Ͻ� ������ ���� �����Ѵ�. 
	
	BoardController(String boardName) {
		this.boardName = boardName;
	}
	
	public void inputBoard() {
		
		Board board = new Board();
		//stem.out.println("[���� �Խ���]");
		
		System.out.print("����? ");
		board.title = sc.nextLine();
		// ������ �Է� �޾� �ν��Ͻ� ���� "content"�� ����
		System.out.print("����? ");
		board.content = sc.nextLine();
		//
		System.out.print("��ȣ? ");
		board.password = sc.nextLine();	
		boards[i++] = board;
	}
	
	static boolean prompt() {
		// ��� �Է��� ������ ���°�
		
		System.out.println("��� �Է��Ͻðڽ��ϱ�?(y/n)");
		String answer = sc.nextLine();
		
		
		if(answer.equals("n")) return true;
		else return false;
	}
	public void printBoard() {
		//stem.out.println("[���� �Խ���]");
		System.out.printf("%d, %s, %s, %s, %s, %d\n", boards[j].no, boards[j].title,boards[j].content, 
				boards[j].password,boards[j].createDate,boards[j].viewCount);
		System.out.println();
		
	}
	
	public void service() {
	
	
		
		// �Խù� ������ �Է� �޴� �ڵ带 �ݺ� ����
		while(true) {
			// �Խù� ������ ���� �� ���� �ν��Ͻ��� ���ۼ��� ����
			
			System.out.printf("[���� > %s]\n",this.boardName);
			inputBoard();
			
			
			if(prompt()) break;
			
		}
		for(j=0; j<i; j++) {
			printBoard();
		}
	
		//boards.printInfo();
		

	}

}
