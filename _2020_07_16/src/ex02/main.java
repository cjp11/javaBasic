package ex02;

class Camera {
	public void take() {
		System.out.println("take picture");
	}
}
class HDCamera {
	public void take() {
		System.out.println("take picture HDC");
	}
}
// ���ο� ������ ī�޶� Ŭ������ ��� �߰��ϸ�
// People Ŭ������ useCamera() ���� ��� �߰����־�� ��
// �̷� �� �������̽��� �������
class People {
	
	
	public void useCamera(Camera c) {
		c.take();
	}
	public void useCamera(HDCamera c) {
		c.take();
	}
}

public class main {

	public static void main(String[] args) {
		People p = new People();
		Camera c1 = new Camera();
		HDCamera hdc = new HDCamera();
		p.useCamera(c1);
		p.useCamera(hdc);
	}

}
