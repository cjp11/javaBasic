package _0702practice;

import java.util.Scanner;

/*
 * 배열에서 특정 값을 가지는 요소를 찾아라. 동일 값의 요소가 여러 개 있으면 가장 앞에 위치한 요소를
찾는 프로그램과 가장 뒤에 있는 요소를 찾는 프로그램을 작성하시오.

가장 앞에 위치한 요소 찾기 
실행 예
요소 수: 7
a[0]= 22
a[1]= 57
a[2]= 11
a[3]= 32
a[4]= 91
a[5]= 32
a[6]= 70
찾을 숫자: 32
그 값은 a[3]에 있습니다.


가장 뒤에 있는 요소 찾기 
요소 수: 7
a[0]= 22
a[1]= 57
a[2]= 11
a[3]= 32
a[4]= 91
a[5]= 32
a[6]= 70
찾을 숫자: 32
그 값은 a[5]에 있습니다.
 */
public class practice6_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열 요소 수: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("배열 값을 요소 수만큼 차례대로 입력하시오");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			
			System.out.printf("a[%d]= %d\n", i, arr[i]);
		}
		
		System.out.println("찾을 숫자: ");
		int find = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			if(arr[i] == find) {
				System.out.printf("가장 앞에 있는 요소 -> 그 값은 a[%d]에 있습니다.\n",i);
				break;
			}
		}
		
		for(int i=n-1; i>=0; i--) {
			if(arr[i] == find) {
				System.out.printf("가장 뒤에 있는 요소 -> 그 값은 a[%d]에 있습니다.",i);
				break;
			}
		}
		
		sc.close();

	}

}
