package edu.exam02.array11;

import java.util.Random;

//2차원 배열
// 1차원 배열 : 학생 5명의 국어 점수
// 2차원 배열 : 3개반 각각 5명의 국어 점수

public class TwoDim {

	public static void main(String[] args) {
		int [][] kor = new int[3][5];
		Random rd = new Random();
		int[] sum = new int[3];
		
		// C++ 하고는 주소 체계가 약간 다름. 
		System.out.println(kor + ", " + kor.length);
		System.out.println(kor[0] + ", " + kor[0].length);
		System.out.println(kor[1] + ", " + kor[1].length);
		System.out.println(kor[2] + ", " + kor[2].length);
		
		//국어점수 100점까지 랜덤으로 받아주고
		// 각 반의 총점을 구하라. 
		
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
			System.out.println(i +"반" + " 총점: " + sum[i]);
		}
		
	}

}
