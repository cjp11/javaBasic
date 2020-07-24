package thread.ex02;
/*
 * 스레드에는 스케쥴링(JVM이 스레드에 cpu 할당하는 것)의 빈도수를 
 * 제어하기 위해 Priority를 가지고 있다.
 * 기본적으로 Normal 우선순위를 가지고 있다.
 */

class ThreadP2 extends Thread {
	private String msg;
	public ThreadP2(String msg, int prio) {
		this.msg = msg;
		setPriority(prio);
	}
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(msg + "(" + getPriority() + ")");
		}
	}
}

public class PriorityTest2 {

	public static void main(String[] args) {
		ThreadP2 tp0 = new ThreadP2("First", Thread.MAX_PRIORITY);
		ThreadP2 tp1 = new ThreadP2("Second", Thread.NORM_PRIORITY);
		ThreadP2 tp2 = new ThreadP2("Third",Thread.MIN_PRIORITY);
		
		tp0.start();	// 스레스 생성순서로 실행될 '가능성'이 높다
		tp1.start();
		tp2.start();
	}

}
