package edu.exam02.needsarray01;
/*
 * int 배열 10개 생성
 * 1~10 저장하고
 * 배열에서 1개씩 꺼내서 총합을 구하시오.
 */
public class SumArray {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("총합: "+ sum);
	}

}
