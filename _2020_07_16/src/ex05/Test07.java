package ex05;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test07 extends Frame {
	public Test07() {
		class MyWindowListener extends WindowAdapter{
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}
		
		addWindowListener(new MyWindowListener());
		setSize(300,300);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test07 f = new Test07();
		f.setVisible(true);
	}

}







