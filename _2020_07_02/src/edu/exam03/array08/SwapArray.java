package edu.exam03.array08;

public class SwapArray {

	public static void swapArr(int[] ar) {
		int temp = 0;
		temp = ar[0];
		ar[0] = ar[1];
		ar[1] = temp;
	}
	public static void main(String[] args) {
		int[] arr = {10,20};
		swapArr(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
			

	}

}
