package edu.exam02.array11;

import java.util.Random;

//2���� �迭
// 1���� �迭 : �л� 5���� ���� ����
// 2���� �迭 : 3���� ���� 5���� ���� ����

public class TwoDim {

	public static void main(String[] args) {
		int [][] kor = new int[3][5];
		Random rd = new Random();
		int[] sum = new int[3];
		
		// C++ �ϰ�� �ּ� ü�谡 �ణ �ٸ�. 
		System.out.println(kor + ", " + kor.length);
		System.out.println(kor[0] + ", " + kor[0].length);
		System.out.println(kor[1] + ", " + kor[1].length);
		System.out.println(kor[2] + ", " + kor[2].length);
		
		//�������� 100������ �������� �޾��ְ�
		// �� ���� ������ ���϶�. 
		
		for(int j=0; j<3; j++) {
			for(int i=0; i<5; i++) {
				kor[j][i] = rd.nextInt(101);
			}
		}
		for(int j=0; j<3; j++) {
			for(int i=0; i<5; i++) {
				sum[j] += kor[j][i];
				
			}
			System.out.println();
		}
		for(int j=0; j<3; j++) {
			for(int i=0; i<5; i++) {
				System.out.print(kor[j][i]+" ");
			}
			System.out.println();
		}
		
		
		for(int i=0; i<sum.length; i++) {
			System.out.println(i +"��" + " ����: " + sum[i]);
		}
		
	}

}
