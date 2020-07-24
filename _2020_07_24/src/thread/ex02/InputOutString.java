package thread.ex02;

import java.util.Scanner;

/*
 * ���� �����忡�� ������� �޾Ƽ� �ٸ� �����忡 �Ѱ��ֱ�
 * 1) �θ� �����带 ���� ������ ����(���� ����) -> X
 * 2) �� ��ü�� ���� ����(���� ����) -> O
 * 
 */

class ShareNews {
	public String strNews = null; 	// ���� �ʵ�
}

class ThreadIn2 extends Thread {
	private Scanner sc = new Scanner(System.in);
	private ShareNews sNews;
	public ThreadIn2(ShareNews sn) {
		this.sNews = sn;
	}
	public void run() {
		System.out.print("���� �Է�: ");
		sNews.strNews = sc.nextLine();
	}
}
class ThreadOut2 extends Thread {
	
	private ShareNews sNews;
	public ThreadOut2(ShareNews sn) {
		this.sNews = sn;
	}
	public void run() {
		System.out.println("���� ����: " + sNews.strNews);
		
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
