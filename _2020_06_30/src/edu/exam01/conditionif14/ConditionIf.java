package edu.exam01.conditionif14;

import java.util.Scanner;

/*
 * 0~100점을 입력하고
 * 학점을 출력하세요
 * A 90점 이상
 * B 80점 이상
 * C 70점 이상
 * D 60점 이상
 * F 60점 미만
 * 
 */
public class ConditionIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		String strScore;
		
		// F학점부터 찍기도 가능 
		if(score >= 90) strScore = "A학점";
		else if(score >= 80) strScore = "B학점";
		else if(score >= 70) strScore = "C학점";
		else if(score >= 60) strScore = "D학점";
		else strScore = "F학점";
		
		System.out.println(strScore);
		sc.close();

	}

}
