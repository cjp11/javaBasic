package edu.exam03.binarysearch;

import java.util.Arrays;

public class BubbleSort {
	
	public static void swap(int[] a,int idx0, int idx1) {
		int temp = a[idx0];
		a[idx0] = a[idx1];
		a[idx1] = temp;
	}
	
	public static void bubbleSort(int[] ar, int o) {
		for(int i=0; i<ar.length-1; i++) {
			for(int j=0; j<ar.length-1-i; j++) {
				if(o*ar[j] > o*ar[j+1]) {
					swap(ar,j,j+1);
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {99,10,22,53,29,55,12};
		System.out.println(Arrays.toString(arr));
		
		bubbleSort(arr,1);	// 인자를 -1로 해주면 내림차순으로 처리됨. 굳이 이렇게 하지 않아도 됨. 오름차순으로 정리하고 값을 서로 바꿔 저장해주는 과정 거치면 됨. 
		
		// 오름 차순으로 된 배열을 역으로 저장해주는 과정
		for(int i=0; i<(arr.length)/2 + 1; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		System.out.println(Arrays.toString(arr));

	}

}
