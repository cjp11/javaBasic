package classAccessModifier01;
import classAccessModifier.C;

public class E extends C{
	public void dm() {
	//	setter(100); // 다른 패키지의 클래스 멤버이므로 안됨
	//	v2 = 200;	// 다른 패키지의 클래스 멤버이므로 안됨
		
		C c = new C();
	//	c.setter(100);	// 상속을 받았더라도 c객체는 C가 있는 패키지와 다르므로 접근 안됨
		
		setter(100);	// 상속 받은 함수를 호출하므로 가능 
		v3 = 300;
		v4 = 400;
		
		
	}
}

class F {
	public void dm() {
		C c = new C();
	//	c.setter(30);	
		c.v4 = 10;
	}
}