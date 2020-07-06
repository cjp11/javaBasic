package edu.exam03.minmax09;

public class SelectMinMax {

	public static void viewMin(int[] ar) {
		System.out.println("최소값: " + ar[0]);
		
	}
	public static void viewMax(int[] ar) {
		System.out.println("최대값: " + ar[ar.length-1]);
	}
	public static void main(String[] args) {
		int[] arr = {99,23,55,21,10,9,86};
		// 오름차순으로 정렬
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j+1] < arr[j]) {
					int temp = 0;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		// 오름차순 정렬값 확인차 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		viewMin(arr);
		viewMax(arr);

	}

}
