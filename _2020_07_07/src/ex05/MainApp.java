package ex05;
// ex06 의 업그레이드 버전 
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
		// new를 한 번만 해준다. 다른 클래스에서 반복적으로 하지 않아도 됨. sc의 주소값만 넘겨주면 된다.  
		Scanner sc = new Scanner(System.in);
		BoardController.sc = sc;
		//BoardController2.sc = sc;
		//BoardController3.sc = sc;
		ContactController.sc = sc;
		
		BoardController board1 = new BoardController("공지 게시판");
		BoardController board2 = new BoardController("영업부 게시판");
		BoardController board3 = new BoardController("개발부 게시판");
		ContactController contact1 = new ContactController("직원 연락처");
		ContactController contact2 = new ContactController("고객 연락처");
	
		
		
		while(true) {
			
			System.out.println("[메뉴]");
			System.out.println("1. 공지 게시판");
			System.out.println("2. 영업부 게시판");
			System.out.println("3. 개발부 게시판");
			System.out.println("4. 직원 연락처");
			System.out.println("5. 고객 연락처");
			System.out.println("0. 종료");
			System.out.println("----------------");			
			System.out.print("메뉴 번호를 입력하세요> ");
			
			//int menuNum = sc.nextInt();		// int로 값을 받으면 제목? 내용? 이렇게 한줄에 두 개가 출력됨		
											// String으로 받아야 오류가 안남. 
			String menuNum = sc.nextLine();
			
			if(menuNum.equals("1")) {
				board1.service();
				//System.out.println("게시판");
				continue;
			}
			else if(menuNum.equals("2")) {
				board2.service();
				//System.out.println("연락처");
				continue;
			}
			else if(menuNum.equals("3")) {
				board3.service();
				continue;
			}
			else if(menuNum.equals("4")) {
				contact1.service();
				continue;
			}
			else if(menuNum.equals("5")) {
				contact2.service();
				continue;
			}
			else if(menuNum.equals("0")) {
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
