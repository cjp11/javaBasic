package edu.exam03.minmax09;

public class SelectMinMaxSol2 {

	public static void viewMin(int[] ar) {
		int min = ar[0];
		for(int i=1; i<ar.length; i++) {
			if(ar[i] < min)
				min = ar[i];
		}
		System.out.println("최소값: " + min);
	}
	public static void viewMax(int[] ar) {
		int max = ar[0];
		for(int i=1; i<ar.length; i++) {
			if(ar[i] > max)
				max = ar[i];
		}
		System.out.println("최대값: " + max);
	}
	
	public static void main(String[] args) {
		int[] arr = {99,23,55,21,10,9,86};
		
		viewMin(arr);
		viewMax(arr);

	}

}
