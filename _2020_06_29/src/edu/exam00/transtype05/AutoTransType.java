package edu.exam00.transtype05;
//�ڵ� �� ��ȯ
// 1) ������ ���� �� -> ū �Ϳ� ��������.
// 2) ����(ǥ�� ���� ������) -> �Ǽ�(ǥ�� ���� ū ��)
public class AutoTransType {
	public static void main(String[] args) {
		//ch ���� i�� ��ȯ�Ǿ� ���� �ȴ�.
		char ch = 'A';
		int i = ch;
		System.out.println(i);
		
		byte b = 100;
		int n = 100;
		System.out.println(b*n);	// b�� int�� �ڵ� ��ȯ�Ǿ� ����)
		
			
		int r = 3;
		double pi = 3.14d;
		System.out.println(r*r*pi);	// r�� double�� �ڵ� ��ȯ
		
		byte x = 100;
		byte y = 100;
		System.out.println(x*y);	// �����÷ο� �Ͼ�� ����. ����� �� ���� ��ȯ�Ǵ� ���� �ƴ϶�
									// ������  int������ �ν��� �ϰ� ���(������ �Ͼ�� ����Ʈ ���� int�̱� ������)
									// C������ ū������ Ÿ���� ���󰡴µ� Java�� �ٸ��� �ν�!
	}
}
