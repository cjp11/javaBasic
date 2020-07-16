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
// 100가지 유형의 카메라가 추가되더라도 useCamera 함수 하나로 사용
// 인터페이스 타입의 레퍼런스에 새로운 객체만 껴주면 됨.
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
