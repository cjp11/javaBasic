package ex02;

import java.util.Scanner;

/*
 * 이름? 홍길동
 * 전화? 010-1111-1111
 * 이메일? hong@test.com
 * 회사?	비트캠프
 * 직위?	대리
 * 계속 입력하시겠습니까?(y/n)
 * --------------------------
 * 이름? 임꺽정
 * 전화? 010-2222-2222
 * 이메일? lim@test.com
 * 회사?	비트캠프
 * 직위?	사원
 * 계속 입력하시겠습니까?(y/n)
 */
public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Contact ct = new Contact();
		System.out.print("이름? ");
		ct.name = sc.nextLine();
		System.out.print("전화? ");
		ct.phone = sc.nextLine();
		System.out.print("이메일? ");
		ct.email = sc.nextLine();
		System.out.print("회사? ");
		ct.company = sc.nextLine();
		System.out.print("직위? ");
		ct.position = sc.nextLine();
		
		System.out.println(ct.name);
		System.out.println(ct.phone);
		System.out.println(ct.email);
		System.out.println(ct.company);
		System.out.println(ct.position);
		
		
		sc.close();
	}

}
