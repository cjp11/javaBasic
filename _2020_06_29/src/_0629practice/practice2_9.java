package _0629practice;

import java.util.Scanner;

public class practice2_9 {

	public static void main(String[] args) {
		double a=0, b=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("밑변과 높이를 각각 입력하시오: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		
		System.out.println("삼각형의 넓이: "+(a*b)/2);
		sc.close();

	}

}
