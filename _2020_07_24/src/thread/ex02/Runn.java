package thread.ex02;

/*
 * java에서 스레드를 담당하는 클래스를 만드는 2가지 방법
 * 1) Thread 클래스를 상속한다.
 * 2) Runnable 인터페이스를 상속하고
 *    객체를 Thread 인자로 넘겨준다
 *    
 *    
 *    2가지 방법을 제공하는 이유
 *    java는 클래스를 단일 상속하기 때문에
 *    이미 다른 클래스를 상속받은 클래스에 
 *    스레드를 제공하려면
 *    Thread를 상속받을 수 없고
 *    Runnable을 상속시켜서 사용하게 된다. 
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
class Stea extends A implements Runnable {		// class Stea extends A,Thread {} 는 다중 상속이므로 불가
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
