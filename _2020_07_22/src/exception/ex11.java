package exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("try.. ��� ����");
			System.out.println("��? ");
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
		}catch(FileNotFoundException e) {			// throw�� �ϸ� ����� ������(�Ʒ��� Ÿ�Կ� ���缭 ���޵��� ����)
													// ��� ����(Exception Ŭ������ �θ� Ŭ����, �������� �ڽ�)
													// ���� ������ �ٲٸ� �ȵ�
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
