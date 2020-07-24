package thread.ex01;
/*
 * 모든 프로세스는 반드시 1개 이상의 스레드가 존재한다.
 * 기본적으로 main 메서드를 실행하는 스레드를 "main 스레드"라고 한다.
 * 이 스레드는 java에서는 JVM 에 의해 부여되고 관리된다.
 */

// 이곳에서는 추가로 2개 스레드를 더 만들어보자

// Thread 클래스의 상속을 받아서 1개 객체를 생성해서 
// 실행할 때마다 스레드가 1개씩 생긴다.

/*
 * 스레드가 실행될 때는 정확하게 나눠서 진행되지 않고 
 * 어느 정도 임의로 실행 시간의 차이가 생기게 된다.
 * 그래서 이런 부분을 정확하게 처리하려면 동기화 작업이 필요하게 된다.
 */

class ShowThread extends Thread {
	String threadName;
	public ShowThread(String name) {
		threadName = name;
	}
	// start()로 객체를 시작하면
	// run() 매서드가 스레드에 의해 실행된다.
	
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("못된 부자집 창고 털기 " + threadName + " " + i);
		
			try {
				sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(threadName + "부하 스레드 일 마침~~");
	}
}
public class ThreadUnderstand {

	
	
	public static void main(String[] args) {
		System.out.println("홍길동 스레드 명령 지시...");
		ShowThread st0 = new ShowThread("마숙");
		ShowThread st1 = new ShowThread("차돌바위");
		
		
		st0.start();	// 스레스 시작
		st1.start();	// 스레드 시작
		
		try {
			Thread.sleep(1100);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("홍길동 스레드 떠남");
		
	}

}
