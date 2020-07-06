package edu.exam03.linearsearch;

import java.util.Scanner;

// 배열에 20개 숫자를 초기화 하고
// 특정 숫자가 index 몇 번에 있는지 반환하는 매서드 구현
// 없으면 -1을 반환한다. 
public class LinearSearch {

	public static int linearSearch(int[] ar, int num) {
		int idx = -1;
		for(int i=0; i<ar.length; i++) {
			if(ar[i] == num) {
				return idx = i;
			}
		}
		return idx;
	}
	
	public static void main(String[] args) {
		int[] arr = {23,22,6,62,87,12,99,88,72,1,21,5,26,73,38,46,29,56,52,2};
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("검색 숫자 입력(-1이면 exit): ");
			int num = sc. nextInt();
			int idx = linearSearch(arr, num);
			if(idx == -1) {
				System.out.println("찾는 숫자가 없습니다. exit");
				break;
			}
			else {
				System.out.printf("%d 번째에 있습니다.\n", idx);
			}
		}
		sc.close();
		
	}

}
