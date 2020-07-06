package edu.exam00.transtype07;

public class CalcAvr {
	public static void main(String[] args) {
		int score0 = 99, score1 = 87, score2 = 77;
		int sum = 0;
		double avg = 0;
		sum = score0 + score1 + score2;
		
		avg = sum / 3;
		System.out.println(sum);	
		System.out.println(avg);
		avg = (double)sum/3;	// 두인자 모두 더블형으로 바뀌어서 계산됨. 
		System.out.println(avg);
		System.out.printf("%.2f\n", avg);	//소수점 두째자리까지 표현하고 반올림해라
		
	}
}
