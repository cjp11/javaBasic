package _0701practice;

import java.util.Scanner;

public class practice4_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			int num = sc.nextInt();
			if(num >= 0) {
				for(int i=num; i>=0; ) {
					System.out.print((--i) + " ");	// --i ������ , �Է°�:5 -> ��°�: 4 3 2 1 0 -1
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
