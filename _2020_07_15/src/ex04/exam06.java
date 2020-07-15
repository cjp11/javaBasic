package ex04;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class exam06 extends Frame {
	public exam06() {
		
		super("윈도우 제목");
	
		Button btn1 = new Button("Button1");
		Button btn2 = new Button("Button2");
		Button btn3 = new Button("Button3");
		Button btn4 = new Button("Button4");
		Button btn5 = new Button("Button5");
		
		// Frame의 기본 레이아웃(BorderLayout)을 FlowLayout으로 교체하자.
		FlowLayout layoutManager = new FlowLayout();
		setLayout(layoutManager); 
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		
		
		
		/*
		// 배치관리자에게 위치를 알려주자
		add(btn1,BorderLayout.NORTH);
		add(btn2,BorderLayout.EAST);
		add(btn3,BorderLayout.SOUTH);
		add(btn4,BorderLayout.WEST);
		add(btn5,BorderLayout.CENTER);
		setSize(400, 300);
		*/
	}

	public static void main(String[] args) {
		exam06 f = new exam06();
		f.setVisible(true);
	}

}
