package ex09;

import java.util.Scanner;

public class BoardController {
	//static Scanner keyScanner = new Scanner(System.in); -> 클래스마다 사용하므로 하나로 합치려면
	static Scanner sc;
	
	//Board[] boards = new Board[10];
	
	BoardDao boardDao = new BoardDao();				// 
	//int i = 0;  //i대신에 Board.cnt를 사용해준다. 
	int j = 0;
	String boardName;	// 게시판마다 이름이 달라야 하기 때문에 인스턴스 변수로 각각 관리한다. 
	
	BoardController(String boardName) {
		this.boardName = boardName;
	}
	
	public void add() {
		
		Board board = new Board();
		//stem.out.println("[공지 게시판]");
		
		System.out.print("제목? ");
		board.title = sc.nextLine();
		// 내용을 입력 받아 인스턴스 변수 "content"에 저장
		System.out.print("내용? ");
		board.content = sc.nextLine();
		//
		System.out.print("암호? ");
		board.password = sc.nextLine();	
		//boards[Board.cnt-1] = board;
		
		boardDao.insert(board);
	}
	
	
	static boolean prompt() {
		// 계속 입력할 것인지 묻는것
		
		System.out.println("계속 입력하시겠습니까?(y/n)");
		String answer = sc.nextLine();
		
		
		if(answer.equals("n")) return true;
		else return false;
	}
	public void list() {
		//stem.out.println("[공지 게시판]");
		Board[] boards = boardDao.selectList();
		
		for(int x=0; x<boards.length; x++) {
			System.out.printf("%d, %s, %s, %s, %s, %d\n", boards[x].no, boards[x].title,boards[x].content, 
					boards[x].password,boards[x].createDate,boards[x].viewCount);
			System.out.println();
		}
		
	}
	public void detail() { /*
		System.out.print("번호? ");
		int no = Integer.parseInt(sc.nextLine());
		
		if(no < 0 || no > Board.cnt) {
			System.out.println("해당 게시물이 없음");
		}
		Board board = boards[no-1];
		System.out.printf("번호: %s\n", board.no);
		System.out.printf("제목: %s\n", board.title);
		System.out.printf("내용: %s\n", board.content);
		System.out.printf("날짜: %s\n", board.createDate);
		System.out.printf("조회수: %s\n", board.viewCount);
		
		*/
	}
	public void update() { /*
		System.out.println("번호? ");
		int no = Integer.parseInt(sc.nextLine());
		
		if(no < 0 || no > Board.cnt) {
			System.out.println("해당 게시물이 없음");
		}
		
		Board board = boards[no-1];
		System.out.printf("제목(%s)? \n", board.title);
		
		System.out.printf("내용(%s)? \n", board.content);
		
		
		System.out.println("변경하시겠습니까?");
		String yes_no = sc.nextLine();
		if(yes_no.equals("y")) {
			board.title = sc.nextLine();
			board.content = sc.nextLine();
			System.out.println("변경하였습니다.");
			*/
		
		
		/*
		 * <Sol2>
		 * Board board = boards[no-1];
		 * Board board1 = new Board();
		 * System.out.printf("제목(%s)? \n", board.title);
		 * board1.title = sc.nextLine();
		 * System.out.printf("내용(%s)? \n", board.content);
		 * board1.content = sc.nextLine();
		 * System.out.println("변경하시겠습니까?");
		   String yes_no = sc.nextLine();
		   if(yes_no.equals("y")) {
			boards[no-1].title = board1.title;
			boards[no-1].content = board1.content;
			System.out.println("변경하였습니다.");
			}
		 * 
		 */
		
		
		
	}
	
	public void delete() {
		System.out.println("번호? ");
		int no = Integer.parseInt(sc.nextLine());
		
		System.out.print("삭제 하시겠습니까?(Y/n)");
		String ans = sc.nextLine();
		
		if(ans.equals("y") || ans.equals("") || ans.equals("Y")) {
			int count = boardDao.delete(no);
			if(count > 0) {
				System.out.println("삭제하였습니다.");
			}
			else {
				System.out.println("해당 게시물이 없음");
			}
		}else {
			System.out.println("삭제를 취소하였습니다.");
		}
	
		
		//Board board = boards[no-1];
		/*
		System.out.println("정말 삭제하시겠습니까?(y/n)");
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
	
		
		// 게시물 정보를 입력 받는 코드를 반복 실행
		while(true) {
			// 게시물 정보를 담을 한 개의 인스턴스와 레퍼선스 선언
			
			System.out.printf("[메인 > %s]\n",this.boardName);
			System.out.println("1. 상위 메뉴로 이동(main)");
			System.out.println("2. 게시판 글쓰기(add)");
			System.out.println("3. 게시판 목록보기(list)");
			System.out.println("4. 개인글 보기(detail)");
			System.out.println("5. 게시판 글 삭제(delete)");
			System.out.println("6. 게시판 글 업데이트(update)");
			System.out.println("메뉴 선택해주세요: ");
			command = sc.nextLine();
			
			switch(command) {
			case "main":	return;/*System.out.println("main()");*/
			case "add":		add(); /*System.out.println("add()")*/ break;
			case "list":	list();/*System.out.println("list()");*/ break;
			case "detail":	System.out.println("detail()"); break;
			case "delete":	delete();/*System.out.println("delete()");*/ break;
			case "update":	update();/*System.out.println("update()");*/ break;
			default:	System.out.println("사용할 수 없는 명령어 입니다."); 
			
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
