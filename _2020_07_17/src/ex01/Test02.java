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
		add(btn);	//btn은 독립적이라 Frame에 넘겨줘야함(연결)
		
		// 1) ActionListener를 로컬 이너 클래스로 구현
		//class MyActionListener implements ActionListener {
		//	@Override
		//	public void actionPerformed(ActionEvent e) {
		//		System.out.println("button click");
		//	}
		//}
		
		// 1)MyActionListener listen = new MyActionListener();
		//   btn.addActionListener(listen);
		
		// 2)btn.addActionListener(new MyActionListener());
		
		// 3) 익명 innerclass로 바꿔보기
		btn.addActionListener(new ActionListener() {	// {} body안에서 implement 하겠다.
			@Override									// 인터페이스는 객체로 만들수 없음
														// 받아들이기.
			public void actionPerformed(ActionEvent e) {
				System.out.println("button click");
			}
		});
		
		btn.addActionListener((e)->{
			System.out.println("button click1");
			System.out.println("button click2");});							// 람다식. 위의 문장과 같은 기능
																	// ActionListener는 하나의 함수만 가지고 있기때문에 람다식을 사용한 것.
		
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
