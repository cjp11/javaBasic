package _0630practice;

import java.util.Random;

public class practice3_19 {

	public static void main(String[] args) {
		Random rd = new Random();
		int num = rd.nextInt(3);
		
		switch(num) {
		case 0: System.out.println("num�� Ȯ��: " + num + ", ����"); break;
		case 1: System.out.println("num�� Ȯ��: " + num +", ����"); break;
		case 2: System.out.println("num�� Ȯ��: " + num +", ��"); break;
		default:
			break;
		}

	}

}
