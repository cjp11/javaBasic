package _0701practice;

import java.util.Scanner;

//�Է� ���� �������� 0���� ī��Ʈ �ٿ� (���� �Է½� ��� �Է½ñ��� ��� �Է� �޴´�)
public class practice4_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			int num = sc.nextInt();
			if(num >= 0) {
				for(int i=num; i>=0; ) {
					System.out.print((--i) + " ");
				}
				break;
			}
			else {
				System.out.println("����� �Է����ּ���");
			}
		}
		
		sc.close();
	}

}
