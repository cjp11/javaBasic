package ex04;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class exam04 extends Frame {
	public exam04() {
		
		super("������ ����");
		// ��ư ������ ���� -> ��ư�� ������(���� ������)�̴�.
		// ������ ���α׷��� ���迡���� ���� ���̴� ��� ���� �������̴�.
		// ��) üũ����, ������ư, ��ũ�ѹ�, ��, �޴�, ��ȭ����, �����̵�� ��
		Button yesBtn = new Button("��");
		Button noBtn = new Button("�ƴϿ�");
		// ��ư �����츦 ������ ������ ���� ���δ�.
		// -> �����쿡 �ڽ� �����츦 ���� �� �� ��ġ�� �����ϴ� ��ġ �����ڰ� �ִ�.
		// -> Frame�� �⺻ ��ġ �����ڴ� "BorderLayout"��� ��ü�̴�.
		// ���� ���� ���̸�, ��� �� ���� ���ٿ�����. ��, �����.
		// ���� ���� �� ���� ��ư�� �����ӿ� ���ϸ�, �� �������� ���� ��ư�� �� ���� ���δ�.
		
		
		// ��ġ�����ڿ��� ��ġ�� �˷�����
		add(yesBtn,BorderLayout.NORTH);
		add(noBtn,BorderLayout.CENTER);
		setSize(400, 300);
	}

	public static void main(String[] args) {
		exam04 f = new exam04();
		f.setVisible(true);
	}

}
