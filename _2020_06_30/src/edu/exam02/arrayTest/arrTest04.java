package edu.exam02.arrayTest;
// ���� 10�� �Է¹޾� �����ϰ� 
// �� �� 2�� 3�� ����� ���
import java.util.Scanner;

public class arrTest04 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("10 ���� ������ �Է��Ͻÿ�");
		for(int i=0; i<arr.length; i++) {
			System.out.println(i + "��° index��: ");
			arr[i] = sc.nextInt();
		}
		for(int j=0; j<arr.length; j++) {
			if(arr[j]%2 == 0 || arr[j]%3 == 0) System.out.println(arr[j]);
		}
		sc.close();
		

	}

}
