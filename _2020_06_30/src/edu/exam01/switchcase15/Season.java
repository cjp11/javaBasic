package edu.exam01.switchcase15;

import java.util.Scanner;
// case는 상수값만 나오면 가능(리터럴)
public class Season {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		int num = sc.nextInt();
		// case 값은 상수 가 나와야함. 변수 이름을 넣으면 안됨. final int a = 10 , 즉 상수로 만들면 case a도 가능 
		switch(num) {
		case 0:	System.out.println("봄");			// break가 없다면 0인케이스의 코드를 수행하고 case 1 조건에 상관없이 case 1의 내용을 수행함.
		case 1:	System.out.println("여름"); break;	// 즉 case 1의 break를 만나면 빠져나옴. 	
		case 2:	System.out.println("가을"); break;
		case 3:	System.out.println("겨울"); break;
		default: System.out.println("해당사항 없음");
		}
		
		switch(num) {
		case 12:
		case 1:
		case 2:
			System.out.println("겨울"); break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄"); break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름"); break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을"); break;
		default:
			System.out.println("해당사항 없음"); break;
			
		}
		System.out.println("계절을 한글로 입력: ");
		String season = sc.next();
		
		switch(season) {
		case "봄": System.out.println("spring");break;
		case "여름": System.out.println("summer");break;
		case "가을": System.out.println("autumn");break;
		case "겨울": System.out.println("winter");break;
		default: System.out.println("winter"); break;
		
		
		} */
		// char형도 가능은한테 2글자 넘어가면 
		char input = sc.next().charAt(0);	// next()는 string형으로 받아들임. 그래서 약간의 조작이 필요
											// cahrAt(0)를 사용하면 받은  string의 첫번째 값을 가져오는것.
		System.out.println(input);
		
		switch(input) {
		case '봄': System.out.println("spring");break;
		case '여': System.out.println("summer");break;
		case '가': System.out.println("autumn");break;
		case '겨': System.out.println("winter");break;
		default: System.out.println("해당없음"); break;
		}
		sc.close();

	}

}
