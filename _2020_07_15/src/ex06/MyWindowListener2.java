package ex06;

import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
// ������ �̺�Ʈ�� ó���� ������ �����
// 1)WindowListener ��Ģ�� ���� �����ϱ�
// 2)WindowAdapter�� ��� �ޱ�.
public class MyWindowListener2 extends WindowAdapter {

	

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("WindowClosing");
		System.exit(0);
	}

	
	
}
