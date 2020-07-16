package ex02;

interface ICamera {
	public void take();
}

class Camera1 implements ICamera{
	public void take() {
		System.out.println("take picture");
	}
}
class HDCamera1 implements ICamera{
	public void take() {
		System.out.println("take picture HDC");
	}
}
// 100���� ������ ī�޶� �߰��Ǵ��� useCamera �Լ� �ϳ��� ���
// �������̽� Ÿ���� ���۷����� ���ο� ��ü�� ���ָ� ��.
class People1 {
	
	public void useCamera(ICamera c) {
		c.take();
	}
	
}

public class main2 {

	public static void main(String[] args) {
		People1 p = new People1();
		Camera1 c1 = new Camera1();
		HDCamera1 hdc = new HDCamera1();
		p.useCamera(c1);
		p.useCamera(hdc);
	}

}
