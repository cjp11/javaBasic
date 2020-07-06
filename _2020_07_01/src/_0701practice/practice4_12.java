package _0701practice;

import java.util.Scanner;

public class practice4_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num_fin = 0;
		
		
		while(true) {
			int num = sc.nextInt();		// for
			if(num < 0) System.out.println("정수 다시 입력하시오");
			else {
				num_fin = num;
				break;
			}
		}
		
		for(int i=num_fin; i>=0; i--) {
			System.out.print(i + " ");
		}
		
		
		
		sc.close();

	}

}
