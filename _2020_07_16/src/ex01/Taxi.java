package ex01;

public class Taxi extends MyCarAdapter {
	@Override
	public void run() {
		System.out.println("�ýð� �޸���");
	}

	@Override
	public void start() {
		System.out.println("�ýð� ����Ѵ�");
	}

	@Override
	public void stop() {
		System.out.println("�ýð� �����");
	}
	
}
