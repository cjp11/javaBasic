package classAccessModifier01;
import classAccessModifier.C2;

public class E2 extends C2{
	public void dm() {
	//	setter(100); // �ٸ� ��Ű���� Ŭ���� ����̹Ƿ� �ȵ�
	//	v2 = 200;	// �ٸ� ��Ű���� Ŭ���� ����̹Ƿ� �ȵ�
		
		C2 c = new C2();
		c.callsetter(100);	
		
	//	callsetter(100);	
	//	v3 = 300;
	//	v4 = 400;
		
		
	}
}

class F2 {
	public void dm() {
		C2 c = new C2();
		c.callsetter(30);	
		c.v4 = 10;
	}
}