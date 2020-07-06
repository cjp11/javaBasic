package edu.exam03.method01;

import java.util.Scanner;

public class MethodDef {
	
	public static int getAge() {
		Scanner sc = new Scanner(System.in);
		System.out.println("좋은 아침입니다.");
		System.out.print("나이는 어떻게 되세요? ");
		int age = 0;
		age = sc.nextInt();
		sc.close();
		return age;
	}
	
	public static void greeting(int age) {
		
		
		//while(true) {	 for( ; ; ) 로 쓰면 초기, 증감값 없고 조건은 항상 참이됨
			
			if(age > 40) {
				System.out.println("안녕하세요");
			}
			else if(age > 30) {
				System.out.println("반가 반가");
			}
			else if(age > 20) {
				System.out.println("안녕");
			}
			else if(age > 10) {
				System.out.println("하이");
			}
			
				

		
		
	}
	
	public static void main(String[] args) {
		int age = 0;
		age = getAge();
		greeting(age);
		
		/* 아래 코드를 그대로 함수에 옮겨준다
		Scanner sc = new Scanner(System.in);
		
		while(true) {	// for( ; ; ) 로 쓰면 초기, 증감값 없고 조건은 항상 참이됨
			System.out.println("좋은 아침입니다.");
			System.out.print("나이는 어떻게 되세요? ");
			int age = 0;
		
			age = sc.nextInt();
			if(age > 40) {
				System.out.println("안녕하세요");
			}
			else if(age > 30) {
				System.out.println("반가 반가");
			}
			else if(age > 20) {
				System.out.println("안녕");
			}
			else if(age > 10) {
				System.out.println("하이");
			}
			else if(age <= 0)
				break;

		}
		sc.close();
		*/
	

	}
}
