package thread.ex03;

// 스레드들간에 공유할 클래스 생성
// 반복문의 반복 회수를 저장할 목적

// context switch 일어나서 문제가 발생.
/*
 * assembly lang에서 
 * 1. int a=10;	-> MOV a, 10
 * 2. int b=20;	-> MOV ..., ...
 * 3. int c;	-> add ..., ...
 * 4. c = a+b; 를 수행한다고 해보자.
 * t1에서 2라인을 수행하는데 t2가 수행될 시간이면 context switching 문제 발생.
 * 즉, t2가 수행되고 t1은 멈췄던 부분에서 다시 수행을 하는데 t2에서 형성되었던 값들과 연동되지 않고,
 * 이전 값으로 수행됨. 즉, 예를 들어 cnt를 t2가 30까지 올려놨는데 t1은 cnt가 0인 상태로 다시 돌아갈 수 있는것임.
 * 그래서 cnt값이 연동되지 않은 값이 나오는 것이다. 
 * 
 */
// critical section issue. 한 스레드가 끝날때까지 다른 스레드는 진입하지 못하게함. 
// -> Syncronized 처리해준다.	-> 자바에서는 이 용어로 간단히 써주면된다(구현되어있음), 반면 C/C++ 에서는 세마포어, 뮤텍스 처럼 직접 구현해주어야 한다. 
class ShareCnt {
	private int cnt = 0;
	public synchronized void increment() {
		cnt++;
	}
	/* 위와 동일 의미
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
		t2.start();	// 보통 이 스레드가 수행될려면 전 스레드 시작 후 100ms 뒤에 시작됨(대략)
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
