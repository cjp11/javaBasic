package edu.exam02.needsarray01;
/*
 * 배열
 * 같은 자료형의 변수들을 나란히 줄세운것
 * 
 * 국어점수 3명
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
		System.out.printf("총합: %d, 평균: %.2f\n",sum,avg);
	}

}
