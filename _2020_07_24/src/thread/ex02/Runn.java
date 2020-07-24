package thread.ex02;

/*
 * java���� �����带 ����ϴ� Ŭ������ ����� 2���� ���
 * 1) Thread Ŭ������ ����Ѵ�.
 * 2) Runnable �������̽��� ����ϰ�
 *    ��ü�� Thread ���ڷ� �Ѱ��ش�
 *    
 *    
 *    2���� ����� �����ϴ� ����
 *    java�� Ŭ������ ���� ����ϱ� ������
 *    �̹� �ٸ� Ŭ������ ��ӹ��� Ŭ������ 
 *    �����带 �����Ϸ���
 *    Thread�� ��ӹ��� �� ����
 *    Runnable�� ��ӽ��Ѽ� ����ϰ� �ȴ�. 
 */


class St implements Runnable {
	private String name;
	public St(String name) {
		this.name = name;
	}
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(name);
		}
	}
}

class Fe implements Runnable {
	private String name;
	public Fe(String name) {
		this.name = name;
	}
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(name);
		}
	}
}

class A {
	
}
class Ste extends Thread {				
	private String name;
	public Ste(String name) {
		this.name = name;
	}
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(name);
		}
	}
}
class Stea extends A implements Runnable {		// class Stea extends A,Thread {} �� ���� ����̹Ƿ� �Ұ�
	private String name;
	public Stea(String name) {
		this.name = name;
	}
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(name);
		}
	}
}


public class Runn {

	public static void main(String[] args) {
		St steal = new St("steal");
		Fe fence = new Fe("fence");
		Stea stea = new Stea("stea");
		Thread ste = new Ste("ste");
		Thread thMaSook = new Thread(steal);
		Thread thChaDol = new Thread(fence);
		thMaSook.start();
		
		try {
			thMaSook.join();
			System.out.println("steal end");
			thChaDol.start();
			thChaDol.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
