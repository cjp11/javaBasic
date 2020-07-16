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
// 새로운 유형의 카메라 클래스를 계속 추가하면
// People 클래스의 useCamera() 또한 계속 추가해주어야 함
// 이럴 때 인터페이스를 사용하자
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
