package ex04;

import java.awt.Button;
import java.awt.Frame;

public class exam03 extends Frame {
	public exam03() {
		
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
		this.add(yesBtn);
		this.add(noBtn);
		setSize(400, 300);
	}

	public static void main(String[] args) {
		exam03 f = new exam03();
		f.setVisible(true);
	}

}
