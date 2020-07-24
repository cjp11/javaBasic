package thread.ex02;

/*
 *  2���� �����带 �����
 *  1��° ������� 1~50 ������ ���� ���
 *  2��° ������� 51~100������ ���� ���
 *  main ������� ����� ������ 2���� ������ ȭ�鿡 ���
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
