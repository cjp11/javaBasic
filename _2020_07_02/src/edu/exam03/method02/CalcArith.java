package edu.exam03.method02;
// �ż���
// ����� ���� �������� ���� ����ϱ� ������ �����
// �Ϻ� ���� ���������
// ������ ������ �ڵ尡 �ݺ��ɶ� �ż��带 �����.
// 1) �ڵ� ���� �پ���.
// 2) �� ���� �ľ�
// 3) �ż��� ���븸 �����ϸ� ����ϴ� ��� ���� ����
// 4) �ڵ��� ��ǰó�� �Ϻΰ� ������ ����� �ش� ��ǰ(�ż���)�� �����ϰų� ��ü�ϸ� ��.

//   ����Ÿ�� �ż����(�Ű�����, ...) {
//		return ����Ÿ�� ����;
//	 }
public class CalcArith {

	public static void add(int a, int b) {
		int res = a + b;
		System.out.printf("%d + %d�� ���� [%d]\n", a, b, res);
	}
	
	public static void main(String[] args) {
		
		add(10,20);
		add(100,200);
		add(1000,2000);		

	}

}