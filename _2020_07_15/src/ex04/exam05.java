package ex04;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class exam05 extends Frame {
	public exam05() {
		
		super("윈도우 제목");
	
		Button btn1 = new Button("Button1");
		Button btn2 = new Button("Button2");
		Button btn3 = new Button("Button3");
		Button btn4 = new Button("Button4");
		Button btn5 = new Button("Button5");
		
		
		
		// 배치관리자에게 위치를 알려주자
		add(btn1,BorderLayout.NORTH);
		add(btn2,BorderLayout.EAST);
		add(btn3,BorderLayout.SOUTH);
		add(btn4,BorderLayout.WEST);
		add(btn5,BorderLayout.CENTER);
		setSize(400, 300);
	}

	public static void main(String[] args) {
		exam05 f = new exam05();
		f.setVisible(true);
	}

}
