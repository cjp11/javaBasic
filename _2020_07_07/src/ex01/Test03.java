package ex01;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner keyScanner = new Scanner(System.in);
		
		// 게시물 인스턴스 주소를 여러 개 저장할 레퍼런스 배열과 인덱스 변수 선언
		Board02[] boards = new Board02[10];
		int i = 0;
		
		// 반복문에서 생성하는 변수를 반복문 밖에 선언
		Board02 board;
		String answer;
		
		// 게시물 정보를 입력 받는 코드를 반복 실행
		while(i<10) {
			// 게시물 정보를 담을 한 개의 인스턴스와 레퍼선스 선언
			board = new Board02();
			// 제목을 입력 받아 인스턴스 변수 "title"에 저장
			System.out.print("제목? ");
			board.title = keyScanner.nextLine();
			// 내용을 입력 받아 인스턴스 변수 "content"에 저장
			System.out.print("내용? ");
			board.content = keyScanner.nextLine();
			//
			System.out.print("암호? ");
			board.password = keyScanner.nextLine();		
			//
			boards[i] = board;
			i++;
			
			answer = keyScanner.nextLine();
			System.out.println("계속 입력하시겠습니까?(y/n)");
			
			
			if(answer.equals("n")) break;
			
		}
	
		//boards.printInfo();
		keyScanner.close();

	}

}
