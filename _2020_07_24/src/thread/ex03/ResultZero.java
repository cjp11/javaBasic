package thread.ex03;
/*
 * 공유 객체를 생성한다.
 * 스레드 2개를 생성하고, 스레드에서는 공유 객체를 공유한다.
 * 1개 스레드는 for문으로 1~1000000 1씩 공유 객체의 변수를 증가시킨다.
 * 1개 스레드는 for문으로 1~1000000 1씩 공유 객체의 변수를 감소시킨다.
 * main에서 공유객체의 최종결과는 0이 나와야한다. 
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
