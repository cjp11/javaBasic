package thread.ex02;
/*
 * �����忡�� �����층(JVM�� �����忡 cpu �Ҵ��ϴ� ��)�� �󵵼��� 
 * �����ϱ� ���� Priority�� ������ �ִ�.
 * �⺻������ Normal �켱������ ������ �ִ�.
 */

class ThreadP extends Thread {
	private String msg;
	public ThreadP(String msg) {
		this.msg = msg;
	}
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(msg + "(" + getPriority() + ")");
		}
	}
}

public class PriorityTest {

	public static void main(String[] args) {
		ThreadP tp0 = new ThreadP("First");
		ThreadP tp1 = new ThreadP("Second");
		ThreadP tp2 = new ThreadP("Third");
		
		tp0.start();
		tp1.start();
		tp2.start();
	}

}
