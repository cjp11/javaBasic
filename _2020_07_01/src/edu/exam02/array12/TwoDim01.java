package edu.exam02.array12;

//import java.util.Random;

/*
 *  4 X 6 �迭�� �����ϰ�
 *  1���� ���������� �����ϰ� ����Ͻÿ�
 */

public class TwoDim01 {

	public static void main(String[] args) {
		//Random rd = new Random();
		int[][] arr;
		arr = new int[4][6];
		int[] sum = new int[2];
		
		int cnt = 1;
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<6; j++) {
				arr[i][j] = cnt++;
				
			}
		}
		for(int i=0; i<6; i++) {		// 1 + 2 + 3 + 4 + 5 + 6
			sum[0] += arr[0][i];
		}
		for(int i=0; i<4; i++) {		// 1 + 7 + 13 + 19 
			sum[1] += arr[i][0];
		}
		System.out.println("0�� ���� ���� ����: " + sum[0]);
		System.out.println("0~3�� ���� 0��° �л��� ���� ����: " + sum[1]);

	}

}
