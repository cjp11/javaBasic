package _0629practice;

import java.util.Scanner;

public class practice2_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("성: ");
		String a = sc.next();
		System.out.println("이름: ");
		
		String b = sc.next();
		
		System.out.println(a+b+"입니다. 안녕하세요");
		sc.close();
	}

}
