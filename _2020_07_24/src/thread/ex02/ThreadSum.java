package thread.ex02;

/*
 *  2개의 스레드를 만든다
 *  1번째 스레드는 1~50 까지의 합을 계산
 *  2번째 스레드는 51~100까지의 합을 계산
 *  main 스레드는 계산이 끝나고 2개의 총합을 화면에 출력
 */

class Calc1 extends Thread {
	
	private int sum = 0;
	
	public void run() {
		for(int i=1; i<51; i++) {
			sum += i;
		}
	}
	int getSum() {
		return sum;
	}
	
}

class Calc2 extends Thread {
	private int sum = 0;
	
	public void run() {
		for(int i=51; i<101; i++) {
			sum += i;
		}
	}
	int getSum() {
		return sum;
	}
}

public class ThreadSum {

	public static void main(String[] args) {
		Calc1 thcal1 = new Calc1();
		Calc2 thcal2 = new Calc2();
		
		thcal1.start();
		thcal2.start();
		try { 
			thcal1.join();
			thcal2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		int sum = thcal1.getSum() + thcal2.getSum();
		System.out.println(sum);
		
	}

}
