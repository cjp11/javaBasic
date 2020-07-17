package ex01;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test02 extends Frame{

	public Test02() {
		setLayout(new FlowLayout());
		Button btn = new Button("test");
		add(btn);	//btn�� �������̶� Frame�� �Ѱ������(����)
		
		// 1) ActionListener�� ���� �̳� Ŭ������ ����
		//class MyActionListener implements ActionListener {
		//	@Override
		//	public void actionPerformed(ActionEvent e) {
		//		System.out.println("button click");
		//	}
		//}
		
		// 1)MyActionListener listen = new MyActionListener();
		//   btn.addActionListener(listen);
		
		// 2)btn.addActionListener(new MyActionListener());
		
		// 3) �͸� innerclass�� �ٲ㺸��
		btn.addActionListener(new ActionListener() {	// {} body�ȿ��� implement �ϰڴ�.
			@Override									// �������̽��� ��ü�� ����� ����
														// �޾Ƶ��̱�.
			public void actionPerformed(ActionEvent e) {
				System.out.println("button click");
			}
		});
		
		btn.addActionListener((e)->{
			System.out.println("button click1");
			System.out.println("button click2");});							// ���ٽ�. ���� ����� ���� ���
																	// ActionListener�� �ϳ��� �Լ��� ������ �ֱ⶧���� ���ٽ��� ����� ��.
		
		addWindowListener(new WindowAdapter() {		
			public void windowClosing(WindowEvent e) {
			System.exit(0);
			}		
		});
		
		setSize(300,200);
	}
	
	
	public static void main(String[] args) {
		Test02 f = new Test02();
		f.setVisible(true);
	}

}
