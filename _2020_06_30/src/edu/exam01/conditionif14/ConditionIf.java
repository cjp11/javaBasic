package edu.exam01.conditionif14;

import java.util.Scanner;

/*
 * 0~100���� �Է��ϰ�
 * ������ ����ϼ���
 * A 90�� �̻�
 * B 80�� �̻�
 * C 70�� �̻�
 * D 60�� �̻�
 * F 60�� �̸�
 * 
 */
public class ConditionIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		String strScore;
		
		// F�������� ��⵵ ���� 
		if(score >= 90) strScore = "A����";
		else if(score >= 80) strScore = "B����";
		else if(score >= 70) strScore = "C����";
		else if(score >= 60) strScore = "D����";
		else strScore = "F����";
		
		System.out.println(strScore);
		sc.close();

	}

}
