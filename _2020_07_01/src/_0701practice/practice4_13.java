package _0701practice;
import java.util.Scanner;
// 문제 4-5와 반대로 0부터 입력한 정수까지 카운트 업하시오.

public class practice4_13 {

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
		
		for(int i=0; i<=num_fin; i++) {
			System.out.print(i + " ");
		}
		
		
		sc.close();

	}

}
