package ex04;

import java.awt.Frame;
// Is A 관계
public class exam02 extends Frame{
	
	public exam02() {
		super("윈도우 제목");
		setSize(400,300);
	}
	public static void main(String[] args) {
		exam02 f = new exam02();
		
		f.setVisible(true);
	}

}
