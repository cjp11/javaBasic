package ex09;
// ex06 의 업그레이드 버전 
import java.util.Scanner;

/* 메인 > 1
	메인/공지 게시판 > list
	1, aaa, bbb, 1111, 2020_07_08, 0
	2, ccc, ddd, 2222, 2020_07_08, 0
	3, eee, fff, 3333, 2020_07_08, 0

	메인/공지 게시판 > add
	제목? ###
	내용? ####
	암호? ######
	저장하시겠습니까?(y/n) y
	저장하였습니다.
	메인/공지 게시판> detail
	번호? 1
	제목: aaa
	내용: bbb
	암호: 1111
	등록일: 2020_07_08
	조회수: 0
	메인/공지 게시판> delete
	번호? 2
	정말 삭제하시겠습니까?(y/n) y
	삭제 되었습니다.
	메인/공지 게시판> list
	1, aaa, bbb, 1111, 2020_07_08, 0
	3, eee, fff, 3333, 2020_07_08, 0
	메인/공지 게시판> update
	번호? 1
	제목(aaa)? ggg
	내용(bbb)? hhh
	변경하시겟습니까? (y/n) y
	변경하였습니다
	메인/공지 게시판> list
	1, ggg, hhh, 1111, 2020_07_08, 0
	3, eee, fff, 3333, 2020_07_08, 0
	메인/공지 게시판> main
	(실행을 종료하고 메인 화면으로 이동)
*/


public class MainApp {

	public static void main(String[] args) {
		// new를 한 번만 해준다. 다른 클래스에서 반복적으로 하지 않아도 됨. sc의 주소값만 넘겨주면 된다.  
		Scanner sc = new Scanner(System.in);
		BoardController.sc = sc;
		//BoardController2.sc = sc;
		//BoardController3.sc = sc;
		ContactController.sc = sc;
		MemberController.sc = sc;
		
		BoardController board1 = new BoardController("공지 게시판");
		BoardController board2 = new BoardController("영업부 게시판");
		BoardController board3 = new BoardController("개발부 게시판");
		ContactController contact1 = new ContactController("직원 연락처");
		ContactController contact2 = new ContactController("고객 연락처");
	
		MemberController member1 = new MemberController();
		
		
		while(true) {
			
			System.out.println("[메뉴]");
			System.out.println("1. 공지 게시판");
			System.out.println("2. 영업부 게시판");
			System.out.println("3. 개발부 게시판");
			System.out.println("4. 직원 연락처");
			System.out.println("5. 고객 연락처");
			System.out.println("6. 회원");
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
			else if(menuNum.equals("6")) {
				member1.service();
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
