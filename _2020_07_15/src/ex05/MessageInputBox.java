package ex05;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Panel;
import java.awt.TextField;

public class MessageInputBox extends Panel {
	public MessageInputBox() {
		super();

		// FlowLayout ��ġ �����ڸ� BorderLayout���� ��ü�Ѵ�.
		setLayout(new BorderLayout());
		TextField inputField = new TextField();
		add(inputField, BorderLayout.CENTER);

		Button sendBtn = new Button("send");
		add(sendBtn, BorderLayout.EAST);
	}
}
