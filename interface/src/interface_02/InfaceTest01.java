package interface_02;

public class InfaceTest01 {

	public static void main(String[] args) {
		// ������ ���� ��Ģ�� ���� �������̽� ���۷��� ������
		// �� �������̽��� ������ Ŭ������ ��ü(�� �ּ�)�� ������ �� �ִ�.
		// Calc c = new Calc();	// �������̽��� �ν��Ͻ��� ���� �� ����.
		Calc c = new CalcImplement();
		
		//"�������̽� ����ü"
		//-> CalcImplement Ŭ����ó�� �������̽� ��Ģ�� ���� ���� Ŭ������ �θ��� ��.
		System.out.println(c.plus(10,30));
	}

}
