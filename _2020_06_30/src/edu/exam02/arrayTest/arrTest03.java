package edu.exam02.arrayTest;
// int �迭 10�� ���� ������ 1~10 ������ �� �����ϰ� Ȧ���� ��� ���
import java.util.Random;

public class arrTest03 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		
		Random rd = new Random();
		for(int i=0; i<arr.length; i++) {
			arr[i] = rd.nextInt(10) + 1;
		}
		for(int j=0; j<arr.length; j++) {
			if(arr[j]%2 != 0) System.out.println(arr[j]);
		}

	}

}
