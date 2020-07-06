package edu.exam02.array08;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int[] score = {98,12,99,9,25};
		System.out.println(Arrays.toString(score));
		
		Arrays.sort(score);	// thread 사용 안할때(크기 작을때) / Arrays.parallelSort(score) thread 사용할때(크기 클때)
		System.out.println(Arrays.toString(score));

	}

}
