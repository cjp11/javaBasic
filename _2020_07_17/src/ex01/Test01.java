package ex01;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test01 extends Frame{

	public Test01() {
		/*
		// 1)로컬 이너 클래스
		class MyWindowListener extends WindowAdapter {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}
	//	MyWindowListener listen = new MyWindowListener();
	//	addWindowListener(listen);
		addWindowListener(new MyWindowListener());
		setSize(300,300);
		*/
		
		// 2)익명 이너클래스
		// -> 객체를 한 번 만들지 않을 거라면, 굳이 클래스를 정식으로 선언할 필요가 있는가?
		// -> 단축 표기법을 이용하여 클래스 선언과 객체 생성을 한 번에 처리하자
		addWindowListener(new WindowAdapter() {		
			public void windowClosing(WindowEvent e) {
			System.exit(0);
			}		
		});
		setSize(300,300);
	}
	public static void main(String[] args) {
		Test01 f = new Test01();
		f.setVisible(true);
	}

}
