package interface_02;
/*
 * �������̽��� �����ϴ� �޼���� �ݵ�� �������̽��� ����� ��� �޼��带 ������ �Ѵ�.
 * -> �� �Ѱ��� �޼���� �������� ������ �ش� Ŭ������ abstract�� �����ؾ� �Ѵ�.
 * ��? abstract �޼���� abstract Ŭ�������� ���� �� �ִ�.
 */
public class CalcImplement implements Calc{
	
	// �������̽��� �޼��带 ������ �� ��Ģ
	//1) public �̾�� �Ѵ�.
	//2) ����Ÿ���� ���ƾ� �Ѵ�.
	//3) �ż������ ���ƾ� �Ѵ�.
	//4) �Ķ���� Ÿ�� �� ������ ���ƾ��Ѵ�.
	//5) �Ķ���� ���� �̸��� �������.
	@Override
	public int plus(int v1, int v2) {
		return v1+v2;
	}

	@Override
	public int minus(int a, int b) {
		return a-b;
	}
	
}
