package _0629practice;

public class practice2_3 {

	public static void main(String[] args) {
		// 만약  x,y값에 실수값을 대입했다면 변수의 데이터 타입과 맞지 않으므로 int 형 -> double 으로 바꿔 주어야 한다. 
		double x=0, y=0;
		double sum = 0;
		double avg = 0;
		
		x = 10.0;
		y = 15.0;
		
		sum = x + y;
		avg = sum/2;
		System.out.println("합: "+sum+ " 평균: "+avg);
	}

}
