package ex01;
/*
 * Ŭ������ �� �� �̻��� �������̽��� ������ �� �ִ�.
 * ���� �ñ׳�ó�� ���� �ż��尡 �ִ� ��� �� ���� �����ϸ� �ȴ�.
 */
public class FlyCar implements Fly, Car{

	@Override
	public void stop() {
		System.out.println("�����.........");
	}

	@Override
	public void run() {		// Fly, Car�� �Ѵ� ����. �ϳ��� �޼ҵ�� �ۼ����ָ��
		System.out.println("�޸���.........");
	}

	@Override
	public void takeOff() {
		System.out.println("�̷��Ѵ�........");
	}
	
}
