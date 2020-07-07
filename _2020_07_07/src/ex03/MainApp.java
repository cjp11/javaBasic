package ex03;

import java.util.Scanner;

/*
 * [메뉴]
 * 1. 게시판
 * 2. 연락처
 * 3. 종료
 * -----------------------
 * 메뉴 번호를 입력하세요> 1
 * [메인 > 게시판] 
 * 제목? aaa
 * 내용? bbb
 * 암호? 1111
 * 계속 입력하시겠습니까?(y/n) n
 * [메인 > 게시판]
 * 1, aaa, bbb, 1111, 2020-07-07, 0					
 * 
 * 메뉴 번호를 입력하세요> 2
 * [메인 > 연락처]
 * 이름? 홍길동
 * 전화? 010
 * 이메일? hong@test.com
 * 회사? 비트
 * 직위? 대리
 * 계속 입력하시겠습니까?(y/n) n
 * [메인 > 연락처]
 * 홍길동, 010, hong@test.com, 비트, 대리 
 */
/*
[메뉴]
* 1. 게시판
* 2. 연락처
* 0. 종료
* -----------------
* 메뉴 번호를 입력하세요 > 1
* 게시판
* [메뉴]
* 1. 게시판
* 2. 연락처
* 0. 종료
* ------------------
* 메뉴 번호를 입력하세요 > 2
* 연락처
* [메뉴]
* 1. 게시판
* 2. 연락처
* 0. 종료
* ------------------
* 메뉴 번호를 입력하세요 > 3
* 해당 메뉴가 없습니다.
* [메뉴]
* 1. 게시판
* 2. 연락처
* 0. 종료
* ------------------
* 메뉴 번호를 입력하세요 >
* 
* 
*/
public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		
		
		while(true) {
			
			System.out.println("[메뉴]");
			System.out.println("1. 게시판");
			System.out.println("2. 연락처");
			System.out.println("0. 종료");
			System.out.println("----------------");			
			System.out.print("메뉴 번호를 입력하세요> ");
			
			int menuNum = sc.nextInt();
			if(menuNum == 1) {
				Test04.main(null);
				//System.out.println("게시판");
				continue;
			}
			else if(menuNum == 2) {
				Test02.main(null);
				//System.out.println("연락처");
				continue;
			}
			else if(menuNum == 0) {
				System.out.println("종료");
				break;
			}
			else {
				System.out.println("해당 메뉴가 없습니다.");
				continue;
			}
			
		}
		sc.close();

	}

}
