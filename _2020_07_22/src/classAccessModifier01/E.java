package classAccessModifier01;
import classAccessModifier.C;

public class E extends C{
	public void dm() {
	//	setter(100); // �ٸ� ��Ű���� Ŭ���� ����̹Ƿ� �ȵ�
	//	v2 = 200;	// �ٸ� ��Ű���� Ŭ���� ����̹Ƿ� �ȵ�
		
		C c = new C();
	//	c.setter(100);	// ����� �޾Ҵ��� c��ü�� C�� �ִ� ��Ű���� �ٸ��Ƿ� ���� �ȵ�
		
		setter(100);	// ��� ���� �Լ��� ȣ���ϹǷ� ���� 
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