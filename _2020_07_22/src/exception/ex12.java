package exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ex12 {

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
		}catch(Exception e) {
			System.out.println("처리");
		}
	}

}
