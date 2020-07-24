package thread.ex02;
/*
 * �����忡�� �����층(JVM�� �����忡 cpu �Ҵ��ϴ� ��)�� �󵵼��� 
 * �����ϱ� ���� Priority�� ������ �ִ�.
 * �⺻������ Normal �켱������ ������ �ִ�.
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
		
		tp0.start();	// ������ ���������� ����� '���ɼ�'�� ����
		tp1.start();
		tp2.start();
	}

}
