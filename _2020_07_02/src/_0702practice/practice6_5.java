package _0702practice;

import java.util.Scanner;

/*
 * 시험 점수의 합계, 평균, 최고점,최저점을 구하는 프로그램을 작성하시오. 사람 수와 점수는 키보드를
통해 입력 받을것
사람 수: 5
점수를 입력하세요.
1번의 점수: 87
2번의 점수: 67
3번의 점수: 98
4번의 점수: 67
5번의 점수: 87
합계는 406점입니다.
평균은 81.2점입니다.
최고점은 98점입니다.
최저점은 67점입니다.
 */
public class practice6_5 {

	public static void main(String[] args) {
		
		int sum = 0;
		double avg = 0f;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("사람 수: ");
		int n = sc.nextInt();
		int[] score = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.println((i+1) +"번의 점수: ");
			score[i]= sc.nextInt();
		}
		// 오름차순 정렬
		for(int i=0; i<score.length-1; i++) {
			for(int j=0; j<score.length-1; j++) {
				if(score[j] > score[j+1]) {
					int temp = score[j];
					score[j] = score[j+1];
					score[j+1] = temp;
				}
			}
		}
		// 점수합
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		System.out.println("합계는 " + sum);
		// 평균
		avg = sum/n;
		System.out.println("평균은 " + avg);
		// 최고점, 최저점
		System.out.println("최고점은 " + score[score.length-1]);
		System.out.println("최저점은 " + score[0]);
		
		
	
		sc.close();

	}

}
