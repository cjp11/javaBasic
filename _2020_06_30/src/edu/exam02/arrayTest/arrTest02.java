package edu.exam02.arrayTest;
// int �迭 10�� ����, 10���� �� �Է¹޾� ������� ���, ���� ���
import java.util.Scanner;

public class arrTest02 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("10���� �������� �ϳ��� �Է��Ͻÿ�: ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(i + "��° index��: ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		for(int j=0; j<arr.length; j++) {
			System.out.println(arr[j]);
		}
		System.out.println("����: " + sum);
		
		sc.close();
	}

}
