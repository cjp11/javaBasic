package edu.exam02.arrayTest;
// int 배열 10개 공간 생성해 1~10 임의의 수 저장하고 홀수만 골라 출력
import java.util.Random;

public class arrTest03 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		
		Random rd = new Random();
		for(int i=0; i<arr.length; i++) {
			arr[i] = rd.nextInt(10) + 1;
		}
		for(int j=0; j<arr.length; j++) {
			if(arr[j]%2 != 0) System.out.println(arr[j]);
		}

	}

}
