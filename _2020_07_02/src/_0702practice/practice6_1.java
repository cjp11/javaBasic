package _0702practice;

import java.util.Scanner;

/*�ڷ����� double�̰� ��� ���� 5�� �迭�� �����ϰ� �� �迭�� ��� ��Ҹ� ǥ���ϴ� ���α׷��� 
�ۼ��Ͻÿ�*/

public class practice6_1 {

	public static void main(String[] args) {
		double[] arr = new double[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("5�� double �� �Ǽ��� �Է� ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
		for(int i=0; i<arr.length; i++) {
			System.out.printf("arr[%d] = %f\n", i, arr[i]);	//double���� %f�� ǥ����. 
		}
		sc.close();

	}

}
