package exception;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("try ....  블록 실행");
			System.out.print("값? ");
			int value = sc.nextInt();
			if(value == 1) {
				throw new Exception("예외 발생!");
			}
			return;
		}catch (Exception e) {
			System.out.println("catch... 블록 실행");
			return;
		}finally {	// 앞 내용에서 return이 된다 하더라도 이 블록을 실행한 후에 return이 된다.
			System.out.println("finally... 블록 실행");
			sc.close();
		}
	}

}
