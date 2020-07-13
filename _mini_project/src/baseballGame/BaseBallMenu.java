package baseballGame;

import java.util.Scanner;

public class BaseBallMenu {
	static Scanner sc;
	
	static int[] print() {
		int[] inputVal = new int[3];
		int i = 0;
		System.out.print("첫번째 숫자 입력>> ");
		inputVal[i++] = sc.nextInt();
		sc.nextLine(); // 첫 번째 숫자 입력 후 엔터키누르는 상황
					   // 엔터키를 받아와 출력이 깔끔해짐.
		System.out.print("두번째 숫자 입력>> ");
		inputVal[i++] = sc.nextInt();
		sc.nextLine();
		System.out.print("세번째 숫자 입력>> ");
		inputVal[i++] = sc.nextInt();
		sc.nextLine();
		return inputVal;
		
	}
}
