package _0630practice;

import java.util.Scanner;

public class practice3_17 {

	public static void main(String[] args) {
		int[] arr = new int[2];
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� ���� �Է�: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		// ����
		int temp = 0;
		if(arr[0] < arr[1]) {
			temp = arr[0];
			arr[0] = arr[1];
			arr[1] = temp;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("�迭�� "+i+ "��° index ��: "+arr[i]);
		}
		
		sc.close();
	}

}
