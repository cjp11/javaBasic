package classAccessModifier;
/*
 * private : Ŭ���� ����� ���� ����
 * (default) : Ŭ���� ��� + ���� ��Ű���� Ŭ����
 * protected : Ŭ���� + ���� ��Ű���� Ŭ���� + �ڽ� Ŭ����
 * public : ��� ���� ����
 */
public class C2 {
	private int v1;
	int v2;
	protected int v3;
	public int v4;
	
	public void m() {
		v1 = 10;
		v2 = 20;
		v3 = 30;
		v4 = 50;
	}
	
	private void setter(int v1) {
		this.v1 = v1;
	}
	public void callsetter(int v1) {
		setter(v1);
	}
	
	
}

class D2 extends C2 {
	public void dm() {
		//v1 = 100; �ٸ� Ŭ������ ���� �Ұ�
		//setter(100);
		v2 = 200;
		v3 = 300;
		v4 = 400;
	}
	
	
}
class F2 {
	public void dm() {
		C2 c = new C2();
		c.v2 = 10;
	}
}