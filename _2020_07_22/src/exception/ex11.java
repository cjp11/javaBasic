package exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("try.. 블록 실행");
			System.out.println("값? ");
			int value = sc.nextInt();
			switch(value) {
			case 1:
				throw new Exception("1111");
			case 2:
				throw new RuntimeException("2222");
			case 3:
				throw new IOException("3333");
			case 4:
				throw new FileNotFoundException("4444");
			}
		}catch(FileNotFoundException e) {			// throw를 하면 여기로 던져짐(아래에 타입에 맞춰서 전달되지 않음)
													// 상속 개념(Exception 클래스가 부모 클래스, 나머지가 자식)
													// 따라서 순서를 바꾸면 안됨
			System.out.println("4444");
		}catch(IOException e) {
			System.out.println("3333");
		}catch(RuntimeException e) {
			System.out.println("2222");
		}catch(Exception e) {
			System.out.println("1111");
		}
	}

}
