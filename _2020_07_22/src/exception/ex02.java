package exception;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		while(true) {
			System.out.print("a/b ?");
			try {
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.printf("����� %d �Դϴ�\n",a/b);
			}catch(Exception e) {
				System.out.println("���� �� ������ �߻��߽��ϴ�.\n�ٽýõ����ּ���");
				
			}
		}
	}

}

/*
 * ���� ó�� ����
 * try {
 * 			���ܰ� �߻��� �� �ִ� �ڵ�
 * 
 * }catch(������ ������ ���� �� ��ü�� ���� �Ķ���� ����) {
 * 			���ܸ� ó���ϴ� �ڵ�
 * }catch(������ ������ ���� �� ��ü�� ���� �Ķ���� ����) {
 * 			���ܸ� ó���ϴ� �ڵ�
 * }finally{
 * 			���ܰ� �߻��ϵ� ���ϵ� ������ �����ϴ� �ڵ� 	
 * }
 * 
 * ���� ó�� ������ Ư¡
 * 1) �Ϲ� �ڵ�� ���� ó�� �ڵ带 ���������ν� �ڵ带 �б� ����. -> �ڵ��� ������ ����
 * 2) ���ܸ� �����ؼ� �ٷ� �� �ִ�.
 */
