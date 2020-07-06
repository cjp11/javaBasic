package _0702practice;

import java.util.Random;
import java.util.Scanner;

/*
 * int�� �迭�� �� ��ҿ� 1 ~ 10�� ������ �����ϰ� �� ����� ���� ����׷���(��ȣ���� *�� ����)��
ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�. ��� ���� Ű����� �Է��Ѵ�. ���������� �ε����� 10���� ���� ��������
ǥ���Ͻÿ�.

��� ��: 12
                        
                        
                      * 
          *           * 
*     *   * *         * 
*     * * * *     *   * 
*     * * * *     * * * 
*   * * * * *     * * * 
*   * * * * * *   * * * 
* * * * * * * * * * * * 
------------------------
0 1 2 3 4 5 6 7 8 9 0 1 	-> �ε��� 10���� ���� ������
[6, 1, 3, 6, 5, 7, 6, 2, 1, 5, 4, 8]	-> ������(�� ����)
 */
public class practice6_4 {

	public static void main(String[] args) {
		int[] arr;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.println("��� ��: ");
		int n = sc.nextInt();
		arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = rd.nextInt(10) + 1;
		}
		
		int[][] brr = new int[n][10];	// n x 10 �迭 
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<arr[i]; j++) {
				brr[i][j] = 1;
			}
			for(int k=arr[i]; k<10; k++) {
				brr[i][k] = 0;
			}
		}
		/*0�� 1�� �켱 ���� (Ȯ�ο�)
		
		for(int i=9; i>=0; i--) {
			for(int j=0; j<n; j++){
				System.out.print(brr[j][i]+ " ");
			}
			System.out.println();
		}*/
		
		for(int i=9; i>=0; i--) {
			for(int j=0; j<n; j++){
				if(brr[j][i] == 1) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
		
		
		// �ͼ��� [0][0] ��Һ��� ���, �� ���� ����׷��� ��µ�
		/*
		for(int i=0; i<n; i++) {
			for(int j=0; j<10; j++) {
				System.out.print(brr[i][j] + " ");
			}
			System.out.println();
		}
		*/
		
		/*for(int i=0; i<n; i++) {
			for(int j=0; j<arr[i]; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		//index ���� 10���� ���� ������
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]%10 +", ");
		}
		
		
		sc.close();

	}

}
