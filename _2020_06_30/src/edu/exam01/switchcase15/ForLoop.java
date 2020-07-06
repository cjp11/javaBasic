package edu.exam01.switchcase15;

public class ForLoop {

	public static void main(String[] args) {
		
		
		// 1~100╠НаЖ гу
		
		int sum = 0;
		for(int i=1; i<101; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		sum = 0;
		int j = 1;
		while(j <= 100) {
			sum += j;
			j++;
		}
		System.out.println(sum);
	}

}
