package _0702practice;

import java.util.Scanner;

/*
 * ���� ������ �հ�, ���, �ְ���,�������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. ��� ���� ������ Ű���带
���� �Է� ������
��� ��: 5
������ �Է��ϼ���.
1���� ����: 87
2���� ����: 67
3���� ����: 98
4���� ����: 67
5���� ����: 87
�հ�� 406���Դϴ�.
����� 81.2���Դϴ�.
�ְ����� 98���Դϴ�.
�������� 67���Դϴ�.
 */
public class practice6_5 {

	public static void main(String[] args) {
		
		int sum = 0;
		double avg = 0f;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��� ��: ");
		int n = sc.nextInt();
		int[] score = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.println((i+1) +"���� ����: ");
			score[i]= sc.nextInt();
		}
		// �������� ����
		for(int i=0; i<score.length-1; i++) {
			for(int j=0; j<score.length-1; j++) {
				if(score[j] > score[j+1]) {
					int temp = score[j];
					score[j] = score[j+1];
					score[j+1] = temp;
				}
			}
		}
		// ������
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		System.out.println("�հ�� " + sum);
		// ���
		avg = sum/n;
		System.out.println("����� " + avg);
		// �ְ���, ������
		System.out.println("�ְ����� " + score[score.length-1]);
		System.out.println("�������� " + score[0]);
		
		
	
		sc.close();

	}

}
