package ex06;
// ex06번이 ex05번보다 덜 발전된 버전
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


/* 위의 것이 목표, 아래 주석은 처음 접근시 
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
		// new를 한 번만 해준다. 스캐너만 넘겨주면 됨. 
		Scanner sc = new Scanner(System.in);
		BoardController.sc = sc;
		BoardController2.sc = sc;
		BoardController3.sc = sc;
	
		
		
		while(true) {
			
			System.out.println("[메뉴]");
			System.out.println("1. 공지 게시판");
			System.out.println("2. 영업부 게시판");
			System.out.println("3. 개발부 게시판");
			System.out.println("4. 연락처");
			System.out.println("0. 종료");
			System.out.println("----------------");			
			System.out.print("메뉴 번호를 입력하세요> ");
			
			int menuNum = sc.nextInt();
			if(menuNum == 1) {
				BoardController.service();
				//System.out.println("게시판");
				continue;
			}
			else if(menuNum == 2) {
				BoardController2.service();
				//System.out.println("연락처");
				continue;
			}
			else if(menuNum == 3) {
				BoardController3.service();
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
