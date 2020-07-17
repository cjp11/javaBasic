package ex03;

public class Exam08 {
	
	public static void main(String[] args) {
		// 문제: 1~10까지 더하기
		int sum = 0;
		for(int i=0; i<=10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		int sum2 = accumulate(10);
		System.out.println(sum2);
		
	}
	
	static int accumulate(int i) {
		if(i==1) return 1;
		else {
			return i+accumulate(i-1);
		}
	}

}
