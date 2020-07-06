package _0702practice;

import java.util.Scanner;

/*자료형은 double이고 요소 수가 5인 배열을 생성하고 이 배열의 모든 요소를 표시하는 프로그램을 
작성하시오*/

public class practice6_1 {

	public static void main(String[] args) {
		double[] arr = new double[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("5개 double 형 실수를 입력 ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
		for(int i=0; i<arr.length; i++) {
			System.out.printf("arr[%d] = %f\n", i, arr[i]);	//double형도 %f로 표시함. 
		}
		sc.close();

	}

}
