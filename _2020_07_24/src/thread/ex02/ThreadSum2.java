package thread.ex02;

/*
 *  2개의 스레드를 만든다
 *  1번째 스레드는 1~50 까지의 합을 계산
 *  2번째 스레드는 51~100까지의 합을 계산
 *  main 스레드는 계산이 끝나고 2개의 총합을 화면에 출력
 */

class Calc extends Thread {
	
	private int sum = 0;
	private int startNum;
	private int endNum;
	public Calc(int startNum, int endNum) {
		this.startNum = startNum;
		this.endNum = endNum;
	}
	
	public void run() {
		for(int i=startNum; i<endNum+1; i++) {
			sum += i;
		}
	}
	int getSum() {
		return sum;
	}
	
}


public class ThreadSum2 {

	public static void main(String[] args) {
		Calc thcal0 = new Calc(1,50);
		Calc thcal1 = new Calc(51,100);
		
		thcal0.start();
		thcal1.start();
		try { 
			thcal0.join();
			thcal1.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		int sum = thcal0.getSum() + thcal1.getSum();
		System.out.println(sum);
		
	}

}
