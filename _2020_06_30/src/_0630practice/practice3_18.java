package _0630practice;

import java.util.Scanner;

public class practice3_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		
		System.out.println("3���� ���� �Է�");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		// ����
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j+1] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}
		}
		// �������� ���ĵ� �迭 ���
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();

	}

}
