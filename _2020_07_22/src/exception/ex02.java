package exception;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		while(true) {
			System.out.print("a/b ?");
			try {
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.printf("결과는 %d 입니다\n",a/b);
			}catch(Exception e) {
				System.out.println("실행 중 오류가 발생했습니다.\n다시시도해주세요");
				
			}
		}
	}

}

/*
 * 예외 처리 문법
 * try {
 * 			예외가 발생할 수 있는 코드
 * 
 * }catch(예외의 종류에 따라 그 객체를 받을 파라미터 변수) {
 * 			예외를 처리하는 코드
 * }catch(예외의 종류에 따라 그 객체를 받을 파라미터 변수) {
 * 			예외를 처리하는 코드
 * }finally{
 * 			예외가 발생하든 안하든 무조건 실행하는 코드 	
 * }
 * 
 * 예외 처리 문법의 특징
 * 1) 일반 코드와 예외 처리 코드를 구분함으로써 코드를 읽기 쉽다. -> 코드의 가독성 높임
 * 2) 예외를 구분해서 다룰 수 있다.
 */
