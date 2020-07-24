package thread.ex03;

/*
 *  2���� �����带 �����
 *  1��° ������� 1~50 ������ ���� ���
 *  2��° ������� 51~100������ ���� ���
 *  main ������� ����� ������ 2���� ������ ȭ�鿡 ���
 */

class ShareSum {
	private int sum = 0;
	public int getSum() {
		return sum;
	}
	public /*synchronized*/ void setAddsum(int n) {		// ���⼭ ���� �߻�. -> ����ȭ ��������!
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
		Calc thcal0 = new Calc(sSum,1,1500);		// ���� ������ ũ�� ���ָ� ���� �������� �ʰ� ����. �񵿱�ȭ����.
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
