package edu.exam02.array10;

import java.util.Arrays;
import java.util.Scanner;

// 5���� ���� �Է¹ް�
// �ּҰ� �ִ밪�� ���ؼ� ����ϼ���.

public class MinMax {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("5�� ���� �Է�: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("�ּҰ�: "+arr[0]);
		System.out.println("�ִ밪: "+arr[arr.length-1]);
		
		sc.close();
		
	}

}
