package interface_02;

public class InfaceTest02 {

	public static void main(String[] args) {
		// Fly ��Ģ�� Car ��Ģ�� ���ÿ� ������ Ŭ������ �ִ�.
		FlyCar obj = new FlyCar();
		
		// �翬�� �� ��ü�� Fly��Ģ�� ������ ������ Fly ���۷����� ������ �� �ִ�.
		Fly fly = obj;
		// �翬�� �� ��ü�� Car��Ģ�� ������ ������ car ���۷����� ������ �� �ִ�.
		Car car = obj;
		
		fly.run();
		fly.takeOff();
		//fly.stop()�� �Ұ� Fly ���� �ƴϱ� ����
		
		car.run();
		car.stop();
		
	}

}
