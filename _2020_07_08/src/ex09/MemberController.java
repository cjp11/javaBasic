package ex09;

import java.util.Scanner;

public class MemberController {
	
	static Scanner sc;
	Member[] mb = new Member[10];
		
	
	public void add() {
		Member mem = new Member();
		System.out.println("이름: ");
		mem.name = sc.nextLine();
		System.out.println("이메일: ");
		mem.email = sc.nextLine();
		System.out.println("비밀번호: ");
		mem.password = sc.nextLine();
		mb[Member.cnt-1] = mem;
		
		
	}
	public void list() {
		if(Member.cnt < 1) {
			System.out.println("회원 목록이 없습니다.");
			return;
		}
		for(int i=0; i<Member.cnt; i++) {
			System.out.printf("%s %s %s %s\n",mb[i].name,mb[i].email, mb[i].password, mb[i].signedUpdate);
		}
	}
	
	public void delete() {
		if(Member.cnt < 1) {
			System.out.println("삭제할 회원 목록이 없습니다.");
			return;
		}
		
		String del;
		int i = 0;
		System.out.println("삭제하려는 회원 이름을 입력: ");
		del = sc.nextLine();
		System.out.println("정말 삭제하시겠습니까?(y/n)");
		String yorn = sc.nextLine();
		
		if(yorn.equals("y")) {
			while(true) {
				if(del.equals(mb[i].name)) {
					for(int j=i; j<Member.cnt; j++) {
						mb[j] = mb[j+1];	
					}
					break;
				}
				i++;
			}
		}else return;
		Member.cnt--;	// 회원수 감소
		mb[Member.cnt] = null;
	}
	
	public void update() {
		System.out.println("업데이트할 회원 이름을 입력: ");
		String upd = sc.nextLine();
		int i = 0;
		
		Member member = new Member();	// 업데이트할 회원 정보 저장.
										// 업데이트를 하지 않더라도 함수 리턴되면 사라지므로 문제 없음
										// 요구 사항에 맞게 작성한 것임(Member.cnt 를 조작해줘야해서 효율적이진 못한듯)
		
		while(true) {
			if(upd.equals(mb[i].name)) {
				System.out.printf("%s -> \n", mb[i].name);
				member.name = sc.nextLine();
				System.out.printf("%s -> \n", mb[i].email);
				member.email = sc.nextLine();
				System.out.printf("%s -> \n", mb[i].password);
				member.password = sc.nextLine();
				System.out.printf("%s -> \n", mb[i].signedUpdate);
				member.signedUpdate = sc.nextLine();
				break;
			}
			i++;
		}
		
		System.out.println("업데이트 하시겠습니까?(y/n)");
		String yorn = sc.nextLine();
		if(yorn.equals("y")) {				
			mb[i] = member;
		}
		Member.cnt--; //member 변수 생성시 증가된 Member.cnt값을 감소 시켜줘야함
	}
	
	public void detail() {
		if(Member.cnt < 1) {
			System.out.println("보여줄 회원이 없습니다.");
			return;
		}
		System.out.println("보고자하는 회원 이름: ");
		String n = sc.nextLine();
		int i = 0;
		while(true) {
			if(n.equals(mb[i].name)) {
				System.out.printf("이름: %s, 이메일: %s, 비밀번호: %s, 등록 날짜: %s\n", mb[i].name, 
						mb[i].email, mb[i].password, mb[i].signedUpdate);
				break;
			}
			i++;
		}
	}
	
	
	public void service() {
		
		String command;
	
		while(true) {
			
			System.out.println("1. 상위 메뉴로 이동(main)");
			System.out.println("2. 회원 추가(add)");
			System.out.println("3. 회원 목록보기(list)");
			System.out.println("4. 회원 세부사항(detail)");
			System.out.println("5. 회원 삭제(delete)");
			System.out.println("6. 회원 업데이트(update)");
			System.out.println("메뉴 선택해주세요: ");
			command = sc.nextLine();
			
			switch(command) {
			case "main":	return;/*System.out.println("main()");*/
			case "add":		add(); /*System.out.println("add()")*/ break;
			case "list":	list(); break;
			case "detail":	detail(); break;
			case "delete":	delete(); break;
			case "update":	update(); break;
			default:	System.out.println("사용할 수 없는 명령어 입니다."); 
			
			}
		}
	}
	
	
}
