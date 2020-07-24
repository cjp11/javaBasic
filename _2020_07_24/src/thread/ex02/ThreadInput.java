package thread.ex02;

import java.util.Scanner;

/*
 * 메인 스레드에서 결과값을 받아서 다른 스레드에 넘겨주기
 * 1) 부모 스레드를 통한 데이터 공유(간접 공유) -> O
 * 2) 힙 객체를 통한 공유(직접 공유) -> X
 * 
 * 이 예제에서는 입력받는 문자열을 공유하는 것임(간접공유)
 * 부모 스레드 : main
 */

class ThreadIn extends Thread {
	private String strNews;
	private Scanner sc = new Scanner(System.in);
	public String getStrNews() {
		return strNews;
	}
	public void run() {
		System.out.printf("ThreadInput: 뉴스를 입력하세요: >> ");
		strNews = sc.nextLine();
	}
}

class ThreadOut extends Thread {
	private String strNews;
	
	public ThreadOut(String news) {
		strNews = news;
	}
	
	public void run() {
		System.out.println("Threadput: 지금 도착한 뉴스는 ["+strNews + "]입니다");
		
	}
}

public class ThreadInput {

	public static void main(String[] args) {
		ThreadIn ti = new ThreadIn();
		ti.start();
		
		try {
			ti.join();
			String news = ti.getStrNews();
			System.out.println("main :"+news);
			ThreadOut to = new ThreadOut(news);
			to.start();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
