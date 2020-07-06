package _0702practice;

import java.util.Random;
import java.util.Scanner;

/*
 * int형 배열의 각 요소에 1 ~ 10의 난수를 대입하고 각 요소으 값을 막대그래프(기호문자 *를 나열)로
표시하는 프로그램을 작성하시오. 요소 수는 키보드로 입력한다. 마지막에는 인덱스를 10으로 나눈 나머지를
표시하시오.

요소 수: 12
                        
                        
                      * 
          *           * 
*     *   * *         * 
*     * * * *     *   * 
*     * * * *     * * * 
*   * * * * *     * * * 
*   * * * * * *   * * * 
* * * * * * * * * * * * 
------------------------
0 1 2 3 4 5 6 7 8 9 0 1 	-> 인덱스 10으로 나눈 나머지
[6, 1, 3, 6, 5, 7, 6, 2, 1, 5, 4, 8]	-> 난수값(별 개수)
 */
public class practice6_4 {

	public static void main(String[] args) {
		int[] arr;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.println("요소 수: ");
		int n = sc.nextInt();
		arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = rd.nextInt(10) + 1;
		}
		
		int[][] brr = new int[n][10];	// n x 10 배열 
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<arr[i]; j++) {
				brr[i][j] = 1;
			}
			for(int k=arr[i]; k<10; k++) {
				brr[i][k] = 0;
			}
		}
		/*0과 1로 우선 찍어보기 (확인용)
		
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
		
		
		// 익숙한 [0][0] 요소부터 출력, 즉 가로 막대그래프 출력됨
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
		//index 값을 10으로 나눈 나머지
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]%10 +", ");
		}
		
		
		sc.close();

	}

}
