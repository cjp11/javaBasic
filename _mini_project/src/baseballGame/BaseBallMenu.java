package baseballGame;

import java.util.Scanner;

public class BaseBallMenu {
	static Scanner sc;
	
	static int[] print() {
		int[] inputVal = new int[3];
		int i = 0;
		System.out.print("ù��° ���� �Է�>> ");
		inputVal[i++] = sc.nextInt();
		sc.nextLine(); // ù ��° ���� �Է� �� ����Ű������ ��Ȳ
					   // ����Ű�� �޾ƿ� ����� �������.
		System.out.print("�ι�° ���� �Է�>> ");
		inputVal[i++] = sc.nextInt();
		sc.nextLine();
		System.out.print("����° ���� �Է�>> ");
		inputVal[i++] = sc.nextInt();
		sc.nextLine();
		return inputVal;
		
	}
}
