package baseballGame;

import java.util.Random;
import java.util.Scanner;

public class GeneratorThreeNum {
	static Scanner sc;
	
	static int[] makeThreeNum() {
		int[] randNum = new int[3];
		Random rd = new Random();
		
		int i = 0;
		// ������ �ߺ�����
		while(i < 3){		
			randNum[i] = rd.nextInt(10);
			boolean outofloop = false;	// for loop ���������� ���� ó��
			if(i>0) {
				for(int j=0; j<i; j++) {
					
					if(randNum[j] == randNum[i]) {
						outofloop = true;
						break;
					};
				}
			}
			if(outofloop == true) continue;
			i++;
		}
		return randNum;
	}
}
