package ex09;

import java.util.Scanner;

public class BoardController {
	//static Scanner keyScanner = new Scanner(System.in); -> Ŭ�������� ����ϹǷ� �ϳ��� ��ġ����
	static Scanner sc;
	
	//Board[] boards = new Board[10];
	
	BoardDao boardDao = new BoardDao();				// 
	//int i = 0;  //i��ſ� Board.cnt�� ������ش�. 
	int j = 0;
	String boardName;	// �Խ��Ǹ��� �̸��� �޶�� �ϱ� ������ �ν��Ͻ� ������ ���� �����Ѵ�. 
	
	BoardController(String boardName) {
		this.boardName = boardName;
	}
	
	public void add() {
		
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
		//boards[Board.cnt-1] = board;
		
		boardDao.insert(board);
	}
	
	
	static boolean prompt() {
		// ��� �Է��� ������ ���°�
		
		System.out.println("��� �Է��Ͻðڽ��ϱ�?(y/n)");
		String answer = sc.nextLine();
		
		
		if(answer.equals("n")) return true;
		else return false;
	}
	public void list() {
		//stem.out.println("[���� �Խ���]");
		Board[] boards = boardDao.selectList();
		
		for(int x=0; x<boards.length; x++) {
			System.out.printf("%d, %s, %s, %s, %s, %d\n", boards[x].no, boards[x].title,boards[x].content, 
					boards[x].password,boards[x].createDate,boards[x].viewCount);
			System.out.println();
		}
		
	}
	public void detail() { /*
		System.out.print("��ȣ? ");
		int no = Integer.parseInt(sc.nextLine());
		
		if(no < 0 || no > Board.cnt) {
			System.out.println("�ش� �Խù��� ����");
		}
		Board board = boards[no-1];
		System.out.printf("��ȣ: %s\n", board.no);
		System.out.printf("����: %s\n", board.title);
		System.out.printf("����: %s\n", board.content);
		System.out.printf("��¥: %s\n", board.createDate);
		System.out.printf("��ȸ��: %s\n", board.viewCount);
		
		*/
	}
	public void update() { /*
		System.out.println("��ȣ? ");
		int no = Integer.parseInt(sc.nextLine());
		
		if(no < 0 || no > Board.cnt) {
			System.out.println("�ش� �Խù��� ����");
		}
		
		Board board = boards[no-1];
		System.out.printf("����(%s)? \n", board.title);
		
		System.out.printf("����(%s)? \n", board.content);
		
		
		System.out.println("�����Ͻðڽ��ϱ�?");
		String yes_no = sc.nextLine();
		if(yes_no.equals("y")) {
			board.title = sc.nextLine();
			board.content = sc.nextLine();
			System.out.println("�����Ͽ����ϴ�.");
			*/
		
		
		/*
		 * <Sol2>
		 * Board board = boards[no-1];
		 * Board board1 = new Board();
		 * System.out.printf("����(%s)? \n", board.title);
		 * board1.title = sc.nextLine();
		 * System.out.printf("����(%s)? \n", board.content);
		 * board1.content = sc.nextLine();
		 * System.out.println("�����Ͻðڽ��ϱ�?");
		   String yes_no = sc.nextLine();
		   if(yes_no.equals("y")) {
			boards[no-1].title = board1.title;
			boards[no-1].content = board1.content;
			System.out.println("�����Ͽ����ϴ�.");
			}
		 * 
		 */
		
		
		
	}
	
	public void delete() {
		System.out.println("��ȣ? ");
		int no = Integer.parseInt(sc.nextLine());
		
		System.out.print("���� �Ͻðڽ��ϱ�?(Y/n)");
		String ans = sc.nextLine();
		
		if(ans.equals("y") || ans.equals("") || ans.equals("Y")) {
			int count = boardDao.delete(no);
			if(count > 0) {
				System.out.println("�����Ͽ����ϴ�.");
			}
			else {
				System.out.println("�ش� �Խù��� ����");
			}
		}else {
			System.out.println("������ ����Ͽ����ϴ�.");
		}
	
		
		//Board board = boards[no-1];
		/*
		System.out.println("���� �����Ͻðڽ��ϱ�?(y/n)");
		String yes_no = sc.nextLine();
		if(yes_no.equals("y")) {
			for(int x = no-1; x < Board.cnt ; x++) {
			    boards[x] = boards[x+1]; 
			    boards[x].no--;
			}
			               
		}
		 
		boards[Board.cnt-1] = null;
		Board.cnt--;
		
		*/
			
			
			/*
			for(int k=0; k<i; k++)	{
				//boards[no-1+k].title = boards[no].no;
				boards[no-1+k].title = boards[no+k].title;
				boards[no-1+k].content = boards[no+k].content;
				boards[no-1+k].createDate = boards[no+k].createDate;
				boards[no-1+k].viewCount = boards[no+k].viewCount;
			}
			i--;
			*/
		
		
		/*
		 * for(int x = no-1; x < i ; x++) [
		       boards[x] = boards[x+1]; 
		 * }
		 * i--;
 				
 		 * 
		 */
	}
	
	
	public void service() {
		String command;
	
		
		// �Խù� ������ �Է� �޴� �ڵ带 �ݺ� ����
		while(true) {
			// �Խù� ������ ���� �� ���� �ν��Ͻ��� ���ۼ��� ����
			
			System.out.printf("[���� > %s]\n",this.boardName);
			System.out.println("1. ���� �޴��� �̵�(main)");
			System.out.println("2. �Խ��� �۾���(add)");
			System.out.println("3. �Խ��� ��Ϻ���(list)");
			System.out.println("4. ���α� ����(detail)");
			System.out.println("5. �Խ��� �� ����(delete)");
			System.out.println("6. �Խ��� �� ������Ʈ(update)");
			System.out.println("�޴� �������ּ���: ");
			command = sc.nextLine();
			
			switch(command) {
			case "main":	return;/*System.out.println("main()");*/
			case "add":		add(); /*System.out.println("add()")*/ break;
			case "list":	list();/*System.out.println("list()");*/ break;
			case "detail":	System.out.println("detail()"); break;
			case "delete":	delete();/*System.out.println("delete()");*/ break;
			case "update":	update();/*System.out.println("update()");*/ break;
			default:	System.out.println("����� �� ���� ��ɾ� �Դϴ�."); 
			
			}
		/*	
			
			inputBoard();			
			if(prompt()) break;
			
		}
		for(j=0; j<i; j++) {
			printBoard();
		}
		 */
		
		}

	}

}
