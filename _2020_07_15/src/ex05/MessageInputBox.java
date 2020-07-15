package ex05;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Panel;
import java.awt.TextField;

public class MessageInputBox extends Panel {
	public MessageInputBox() {
		super();

		// FlowLayout 배치 관리자를 BorderLayout으로 교체한다.
		setLayout(new BorderLayout());
		TextField inputField = new TextField();
		add(inputField, BorderLayout.CENTER);

		Button sendBtn = new Button("send");
		add(sendBtn, BorderLayout.EAST);
	}
}
