package edu.exam02.array08;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int[] score = {98,12,99,9,25};
		System.out.println(Arrays.toString(score));
		
		Arrays.sort(score);	// thread ��� ���Ҷ�(ũ�� ������) / Arrays.parallelSort(score) thread ����Ҷ�(ũ�� Ŭ��)
		System.out.println(Arrays.toString(score));

	}

}
