package thread.ex03;

/*
 *  2개의 스레드를 만든다
 *  1번째 스레드는 1~50 까지의 합을 계산
 *  2번째 스레드는 51~100까지의 합을 계산
 *  main 스레드는 계산이 끝나고 2개의 총합을 화면에 출력
 */

class ShareSum {
	private int sum = 0;
	public int getSum() {
		return sum;
	}
	public /*synchronized*/ void setAddsum(int n) {		// 여기서 문제 발생. -> 동기화 시켜주자!
		sum += n;
	}
	
}

class Calc extends Thread {
	
	//private int sum = 0;
	private ShareSum sSum;
	private int startNum;
	private int endNum;
	public Calc(ShareSum sSum, int startNum, int endNum) {
		this.sSum = sSum;
		this.startNum = startNum;
		this.endNum = endNum;
	}
	
	public void run() {
		for(int i=startNum; i<endNum+1; i++) {
			sSum.setAddsum(i);
		}
	}
	
	
}


public class ThreadSum2 {

	public static void main(String[] args) {
		ShareSum sSum = new ShareSum();		
		Calc thcal0 = new Calc(sSum,1,1500);		// 값을 적당히 크게 해주면 값이 일정하지 않게 나옴. 비동기화때문.
		Calc thcal1 = new Calc(sSum,1501,5000);
		Calc thcal2 = new Calc(sSum,5001,10000);
		
		thcal0.start();
		thcal1.start();
		thcal2.start();
		try { 
			thcal0.join();
			thcal1.join();
			thcal2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		System.out.println(sSum.getSum());
		
	}

}
