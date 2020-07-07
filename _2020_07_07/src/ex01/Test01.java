/*	<입력>
 *	제목?		aaaa
 *	내용? 	bbbb 
 * 	암호?		1111
 * 	----------------------------
 * 	<출력>
 *  1,	aaaa,	bbbb,	1111,	2020-07-07,	0			/1,0,date 는 디폴트로 값 들어가게함. 
 */

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
 *  1,	aaaa,	bbbb,	1111,	2020-07-07,	0
 */



package ex01;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner keyScanner = new Scanner(System.in);
		
		Board board;
		board = new Board();
		System.out.print("제목? ");
		board.title = keyScanner.nextLine();
		System.out.print("내용? ");
		board.content = keyScanner.nextLine();
		System.out.print("암호? ");
		board.password = keyScanner.nextLine();
		
		
		board.printInfo();
		keyScanner.close();
	}

}
