package ex06;

import java.awt.Frame;

public class MainApp extends Frame{

	
	public MainApp() {
		super("event");
		setSize(600,480);
	}
	public static void main(String[] args) {
		MainApp f = new MainApp();
		f.addWindowListener(new MyWindowListener());
		f.setVisible(true);
	}

}
