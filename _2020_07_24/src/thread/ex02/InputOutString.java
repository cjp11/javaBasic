package thread.ex02;

import java.util.Scanner;

/*
 * 메인 스레드에서 결과값을 받아서 다른 스레드에 넘겨주기
 * 1) 부모 스레드를 통한 데이터 공유(간접 공유) -> X
 * 2) 힙 객체를 통한 공유(직접 공유) -> O
 * 
 */

class ShareNews {
	public String strNews = null; 	// 공유 필드
}

class ThreadIn2 extends Thread {
	private Scanner sc = new Scanner(System.in);
	private ShareNews sNews;
	public ThreadIn2(ShareNews sn) {
		this.sNews = sn;
	}
	public void run() {
		System.out.print("뉴스 입력: ");
		sNews.strNews = sc.nextLine();
	}
}
class ThreadOut2 extends Thread {
	
	private ShareNews sNews;
	public ThreadOut2(ShareNews sn) {
		this.sNews = sn;
	}
	public void run() {
		System.out.println("도착 뉴스: " + sNews.strNews);
		
	}
}
public class InputOutString {

	public static void main(String[] args) throws InterruptedException {
		ShareNews sNews = new ShareNews();
		ThreadIn2 ti = new ThreadIn2(sNews);
		ThreadOut2 to = new ThreadOut2(sNews);
		ti.start();
		ti.join();
		to.start();
		to.join();
	}

}
