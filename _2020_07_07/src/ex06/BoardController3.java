package ex06;

import java.util.Scanner;

public class BoardController3 {
	//static Scanner keyScanner = new Scanner(System.in); -> 클래스마다 사용하므로 하나로 합치려면
	static Scanner sc;
	
	
	static Board inputBoard() {
		
		Board board = new Board();
		System.out.println("[개발부 게시판]");
		
		System.out.print("제목? ");
		board.title = sc.nextLine();
		// 내용을 입력 받아 인스턴스 변수 "content"에 저장
		System.out.print("내용? ");
		board.content = sc.nextLine();
		//
		System.out.print("암호? ");
		board.password = sc.nextLine();	
		return board;
	}
	
	static boolean prompt() {
		// 계속 입력할 것인지 묻는것
		
		System.out.println("계속 입력하시겠습니까?(y/n)");
		String answer = sc.nextLine();
		
		
		if(answer.equals("n")) return true;
		else return false;
	}
	static void printBoard(Board board) {
		System.out.println("[개발부 게시판]");
		System.out.printf("%d, %s, %s, %s, %s, %d\n", board.no, board.title, board.content, 
				board.password, board.createDate, board.viewCount);
		
	}
	
	public static void service() {
	
		
		// 게시물 인스턴스 주소를 여러 개 저장할 레퍼런스 배열과 인덱스 변수 선언
		Board[] boards = new Board[10];
		int i = 0;
		
		
		// 게시물 정보를 입력 받는 코드를 반복 실행
		while(i<10) {
			// 게시물 정보를 담을 한 개의 인스턴스와 레퍼선스 선언
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
