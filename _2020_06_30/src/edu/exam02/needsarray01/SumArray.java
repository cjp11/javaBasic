package edu.exam02.needsarray01;
/*
 * int �迭 10�� ����
 * 1~10 �����ϰ�
 * �迭���� 1���� ������ ������ ���Ͻÿ�.
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
		System.out.println("����: "+ sum);
	}

}
