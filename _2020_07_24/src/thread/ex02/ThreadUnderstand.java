package thread.ex02;
/*
 * ��� ���μ����� �ݵ�� 1�� �̻��� �����尡 �����Ѵ�.
 * �⺻������ main �޼��带 �����ϴ� �����带 "main ������"��� �Ѵ�.
 * �� ������� java������ JVM �� ���� �ο��ǰ� �����ȴ�.
 */

// �̰������� �߰��� 2�� �����带 �� ������

// Thread Ŭ������ ����� �޾Ƽ� 1�� ��ü�� �����ؼ� 
// ������ ������ �����尡 1���� �����.

/*
 * �����尡 ����� ���� ��Ȯ�ϰ� ������ ������� �ʰ� 
 * ��� ���� ���Ƿ� ���� �ð��� ���̰� ����� �ȴ�.
 * �׷��� �̷� �κ��� ��Ȯ�ϰ� ó���Ϸ��� ����ȭ �۾��� �ʿ��ϰ� �ȴ�.
 */

class ShowThread extends Thread {
	String threadName;
	public ShowThread(String name) {
		threadName = name;
	}
	// start()�� ��ü�� �����ϸ�
	// run() �ż��尡 �����忡 ���� ����ȴ�.
	
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("���� ������ â�� �б� " + threadName + " " + i);
		
			try {
				sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(threadName + "���� ������ �� ��ħ~~");
	}
}
public class ThreadUnderstand {

	
	
	public static void main(String[] args) {
		System.out.println("ȫ�浿 ������ ��� ����...");
		ShowThread1 st0 = new ShowThread1("����");
		ShowThread1 st1 = new ShowThread1("��������");
		
		
		st0.start();	// ������ ����
		st1.start();	// ������ ����
		
		try {
			//Thread.sleep(100);
			st0.join();	// st0�� ���������� ��ٷ��ְ� ����
			st1.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("ȫ�浿 ������ ����");
		
	}

}
