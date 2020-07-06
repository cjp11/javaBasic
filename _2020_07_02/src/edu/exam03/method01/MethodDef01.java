package edu.exam03.method01;

import java.util.Scanner;

public class MethodDef01 {
	//앞의 예제와 다른 점은 public static int age = 0; 부분임
	// 즉, 전역변수 비슷하게 사용되는 개념
	// age 를 아래처럼 선언하면 함수를 생성하고 내부에서
	// age를 사용할 때 편하게 사용할 수 있음
	
	public static int age = 0;
	
	public static int getAge() {
		Scanner sc = new Scanner(System.in);
		System.out.println("좋은 아침입니다.");
		System.out.print("나이는 어떻게 되세요? ");
		//int age = 0;
		age = sc.nextInt();
		sc.close();
		return age;
	}
	
	public static void greeting() {
		
		
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
		//int age = 0;
		getAge();
		greeting();
		
	

	}

}
