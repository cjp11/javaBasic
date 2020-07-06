package _0630practice;

import java.util.Random;

public class practice3_19 {

	public static void main(String[] args) {
		Random rd = new Random();
		int num = rd.nextInt(3);
		
		switch(num) {
		case 0: System.out.println("num값 확인: " + num + ", 가위"); break;
		case 1: System.out.println("num값 확인: " + num +", 바위"); break;
		case 2: System.out.println("num값 확인: " + num +", 보"); break;
		default:
			break;
		}

	}

}
