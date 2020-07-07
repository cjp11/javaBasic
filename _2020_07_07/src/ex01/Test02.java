

/*  하고자 하는 것 (반복 입력되게 만들기)
 *	제목?		aaaa
 *	내용? 	bbbb 
 * 	암호?		1111
 *  계속 입력하시겠습니까?(y/n) y
 *  제목?		cccc
 *  내용?		dddd
 *  암호?		2222
 *  계속 입력하시겠습니까?(y/n) n
 * 	----------------------------
 * 	<출력>
 *  1,	aaaa,	bbbb,	1111,	2020-07-07,	0			/1,0,date 는 디폴트로 값 들어가게함. 
 *  2,	cccc,	dddd,	2222,	2020-07-07,	1
 */



package ex01;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner keyScanner = new Scanner(System.in);
		/*
		while(true) {
			Board02[] boards;
			boards = new Board02();
			System.out.print("제목? ");
			board.title = keyScanner.nextLine();
			System.out.print("내용? ");
			board.content = keyScanner.nextLine();
			System.out.print("암호? ");
			board.password = keyScanner.nextLine();		
			
			System.out.println("계속 입력하시겠습니까?(y/n)");
			String answer = keyScanner.nextLine();
			if(answer.equals("y")) continue;
			else break;
		}
	
		board.printInfo();*/
		keyScanner.close();
	}

}
