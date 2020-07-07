package ex07;

import java.util.Scanner;

public class BoardController {
	//static Scanner keyScanner = new Scanner(System.in); -> 클래스마다 사용하므로 하나로 합치려면
	static Scanner sc;
	
	Board[] boards = new Board[10];
	int i = 0;
	int j = 0;
	String boardName;	// 게시판마다 이름이 달라야 하기 때문에 인스턴스 변수로 각각 관리한다. 
	
	BoardController(String boardName) {
		this.boardName = boardName;
	}
	
	public void inputBoard() {
		
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
		boards[i++] = board;
	}
	
	static boolean prompt() {
		// 계속 입력할 것인지 묻는것
		
		System.out.println("계속 입력하시겠습니까?(y/n)");
		String answer = sc.nextLine();
		
		
		if(answer.equals("n")) return true;
		else return false;
	}
	public void printBoard() {
		//stem.out.println("[공지 게시판]");
		System.out.printf("%d, %s, %s, %s, %s, %d\n", boards[j].no, boards[j].title,boards[j].content, 
				boards[j].password,boards[j].createDate,boards[j].viewCount);
		System.out.println();
		
	}
	
	public void service() {
	
	
		
		// 게시물 정보를 입력 받는 코드를 반복 실행
		while(true) {
			// 게시물 정보를 담을 한 개의 인스턴스와 레퍼선스 선언
			
			System.out.printf("[메인 > %s]\n",this.boardName);
			inputBoard();
			
			
			if(prompt()) break;
			
		}
		for(j=0; j<i; j++) {
			printBoard();
		}
	
		//boards.printInfo();
		

	}

}
