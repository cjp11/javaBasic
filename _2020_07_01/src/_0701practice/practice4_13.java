package _0701practice;
import java.util.Scanner;
// ���� 4-5�� �ݴ�� 0���� �Է��� �������� ī��Ʈ ���Ͻÿ�.

public class practice4_13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num_fin = 0;
		
		
		while(true) {
			int num = sc.nextInt();		// for
			if(num < 0) System.out.println("���� �ٽ� �Է��Ͻÿ�");
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
