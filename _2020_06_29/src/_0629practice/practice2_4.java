package _0629practice;

import java.util.Scanner;

public class practice2_4 {

	public static void main(String[] args) {
		int a=0,b=0,c=0;
		int sum = 0;
		int avg = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("세 정수를 입력하시오");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		sum = a + b + c;
		avg  = (a+b+c)/3;
		System.out.println("합: "+sum+" 평균: "+avg);
		sc.close();

	}

}
