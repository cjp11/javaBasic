package thread.ex03;
/*
 * ���� ��ü�� �����Ѵ�.
 * ������ 2���� �����ϰ�, �����忡���� ���� ��ü�� �����Ѵ�.
 * 1�� ������� for������ 1~1000000 1�� ���� ��ü�� ������ ������Ų��.
 * 1�� ������� for������ 1~1000000 1�� ���� ��ü�� ������ ���ҽ�Ų��.
 * main���� ������ü�� ��������� 0�� ���;��Ѵ�. 
 */

class ShareObject {
	private int cnt = 0;
	public synchronized void incre() {
		cnt++;
	}
	public synchronized void decre() {
		cnt--;
	}
	public int getSum() {
		return cnt;
	}
}

class ThreadObject extends Thread {
	private ShareObject sobj;
	private int judge =  0;
	public ThreadObject(ShareObject sobj, int judge) {
		this.sobj = sobj;
		this.judge = judge;
	}
	
	public void run() {
		if(judge == 1) {
			for(int i=1; i<1000001; i++) {
				sobj.incre();
			}
		}else {
			for(int i=1; i<1000001; i++) {
				sobj.decre();
			}
		}
	}
}
public class ResultZero {

	public static void main(String[] args) {
		ShareObject sobj = new ShareObject();
		ThreadObject t1 = new ThreadObject(sobj,1);
		ThreadObject t2 = new ThreadObject(sobj,-1);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
			System.out.println(sobj.getSum());
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
