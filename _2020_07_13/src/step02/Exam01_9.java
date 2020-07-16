package step02;

import java.util.Scanner;

/*
 * 주제: String 클래스 = toUpperCase(), toLowerCase(), trim()
 */
public class Exam01_9 {

	public static void main(String[] args) {
		String str1 = "		Hello, World!	";
		System.out.printf("[%s]\n", str1.toUpperCase());
		System.out.printf("[%s]\n", str1.toLowerCase());
		System.out.printf("[%s]\n", str1.trim());
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력?(yes/no)");
		String message = sc.nextLine();
		/*
		if(message.equals("y")) {
			System.out.println("y를 입력하셨습니다.");
		}*/
		//message.trim().toLowerCase().equals("y");		// String 값을 리턴하므로 . 을 계속 붙일 수 있는 것임. 
														// equals는 boolean 타입이어서 뒤에 다른 메소드를 호출할 수 없음.
		
		if(message.trim().toLowerCase().equals("yes")) {
			System.out.println("y를 입력하셨습니다.");
		}else {
			System.out.println("n를 입력하셨습니다.");
		}
		sc.close();

	}

}
