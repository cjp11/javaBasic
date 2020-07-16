package ex05;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int value = Integer.parseInt(sc.nextLine());
		switch(value) {
		case Subject.programming.C:
			System.out.println("C 언어 ");
			break;
		case Subject.language.ENGLISH:
			System.out.println("영어 ");
			break;
		}
	}

}
