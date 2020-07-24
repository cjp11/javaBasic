package thread.ex03;

// ������鰣�� ������ Ŭ���� ����
// �ݺ����� �ݺ� ȸ���� ������ ����

// context switch �Ͼ�� ������ �߻�.
/*
 * assembly lang���� 
 * 1. int a=10;	-> MOV a, 10
 * 2. int b=20;	-> MOV ..., ...
 * 3. int c;	-> add ..., ...
 * 4. c = a+b; �� �����Ѵٰ� �غ���.
 * t1���� 2������ �����ϴµ� t2�� ����� �ð��̸� context switching ���� �߻�.
 * ��, t2�� ����ǰ� t1�� ����� �κп��� �ٽ� ������ �ϴµ� t2���� �����Ǿ��� ����� �������� �ʰ�,
 * ���� ������ �����. ��, ���� ��� cnt�� t2�� 30���� �÷����µ� t1�� cnt�� 0�� ���·� �ٽ� ���ư� �� �ִ°���.
 * �׷��� cnt���� �������� ���� ���� ������ ���̴�. 
 * 
 */
// critical section issue. �� �����尡 ���������� �ٸ� ������� �������� ���ϰ���. 
// -> Syncronized ó�����ش�.	-> �ڹٿ����� �� ���� ������ ���ָ�ȴ�(�����Ǿ�����), �ݸ� C/C++ ������ ��������, ���ؽ� ó�� ���� �������־�� �Ѵ�. 
class ShareCnt {
	private int cnt = 0;
	public synchronized void increment() {
		cnt++;
	}
	/* ���� ���� �ǹ�
	 * public void increment() {
	 * 		synchronized(this) {
	 * 		cnt++;
	 *  }
	 * }
	 */
	public int getCnt() {
		return cnt;
	}
}

class ThreadLoop extends Thread {
	private ShareCnt sc;
	public ThreadLoop(ShareCnt sc) {
		this.sc = sc;
	}
	public void run() {
		for(int i=0; i<1000000; i++) {
			sc.increment();
		}
	}
}

public class ThreadSyncError {

	public static void main(String[] args) {
		ShareCnt shareCnt = new ShareCnt();
		ThreadLoop t1 = new ThreadLoop(shareCnt);
		ThreadLoop t2 = new ThreadLoop(shareCnt);
		ThreadLoop t3 = new ThreadLoop(shareCnt);
		t1.start();
		t2.start();	// ���� �� �����尡 ����ɷ��� �� ������ ���� �� 100ms �ڿ� ���۵�(�뷫)
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			System.out.println(shareCnt.getCnt());
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
