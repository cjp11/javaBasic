package step02;

import java.util.Scanner;

/*
 * ����: String Ŭ���� = toUpperCase(), toLowerCase(), trim()
 */
public class Exam01_9 {

	public static void main(String[] args) {
		String str1 = "		Hello, World!	";
		System.out.printf("[%s]\n", str1.toUpperCase());
		System.out.printf("[%s]\n", str1.toLowerCase());
		System.out.printf("[%s]\n", str1.trim());
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է�?(yes/no)");
		String message = sc.nextLine();
		/*
		if(message.equals("y")) {
			System.out.println("y�� �Է��ϼ̽��ϴ�.");
		}*/
		//message.trim().toLowerCase().equals("y");		// String ���� �����ϹǷ� . �� ��� ���� �� �ִ� ����. 
														// equals�� boolean Ÿ���̾ �ڿ� �ٸ� �޼ҵ带 ȣ���� �� ����.
		
		if(message.trim().toLowerCase().equals("yes")) {
			System.out.println("y�� �Է��ϼ̽��ϴ�.");
		}else {
			System.out.println("n�� �Է��ϼ̽��ϴ�.");
		}
		sc.close();

	}

}
