package ex06;

import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
// 윈도우 이벤트를 처리할 리스너 만들기
// 1)WindowListener 규칙을 직접 구현하기
// 2)WindowAdapter를 상속 받기.
public class MyWindowListener2 extends WindowAdapter {

	

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("WindowClosing");
		System.exit(0);
	}

	
	
}
