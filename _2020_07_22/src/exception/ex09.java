package exception;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("try ....  ��� ����");
			System.out.print("��? ");
			int value = sc.nextInt();
			if(value == 1) {
				throw new Exception("���� �߻�!");
			}
			return;
		}catch (Exception e) {
			System.out.println("catch... ��� ����");
			return;
		}finally {	// �� ���뿡�� return�� �ȴ� �ϴ��� �� ����� ������ �Ŀ� return�� �ȴ�.
			System.out.println("finally... ��� ����");
			sc.close();
		}
	}

}
