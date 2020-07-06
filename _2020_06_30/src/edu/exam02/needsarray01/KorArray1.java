package edu.exam02.needsarray01;

import java.util.Random;


public class KorArray1 {

	public static void main(String[] args) {
		Random rd = new Random();
		int[] kor = new int[700];
		int sum = 0;
		float avg = 0f;
		
		for(int i=0; i<kor.length; i++) {
			kor[i] = rd.nextInt(101);
		}
		for(int j=0; j<kor.length; j++) {
			sum += kor[j];
		}
		
		avg = (float)sum/3;
		System.out.printf("ÃÑÇÕ: %d, Æò±Õ: %.2f\n",sum,avg);
	
	}

}
