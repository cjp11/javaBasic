package edu.exam02.needsarray01;
/*
 * �迭
 * ���� �ڷ����� �������� ������ �ټ����
 * 
 * �������� 3��
 * int kor0,kor1,kor2;
 * 
 * 
 */

public class WhatArray {

	public static void main(String[] args) {
		int kor0 = 99, kor1 = 98, kor2 = 80;
		int sum = 0;
		float avg = 0f;
		sum = kor0 + kor1 + kor2;
		avg = (float)sum/3;
		System.out.printf("����: %d, ���: %.2f\n",sum,avg);
	}

}
