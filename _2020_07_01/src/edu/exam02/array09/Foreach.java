package edu.exam02.array09;

public class Foreach {

	public static void main(String[] args) {
		int[] score = {89,99,100,21,10};
		
		for(int i=0; i<score.length; i++) {
			System.out.print(score[i] + ", ");
		}
		System.out.println();
		// ���� �Ȱ��� �����. 
		for(int scr : score) {
			System.out.print(scr + ", ");
		}

	}

}
