package step01.ex01;

public class Test03 {
	
	
	public static void main(String[] args) {
		// ���: 3 - 5 + 7 + 2 = ?
		
		Calc2.plus(3);
		Calc2.minus(5);
		Calc2.plus(7);
		Calc2.plus(2);
		System.out.println(Calc2.result);
		
		Calc2.result = 0; // �ʱ�ȭ
		Calc2.plus(7);
		Calc2.plus(3);
		Calc2.minus(2);
		Calc2.minus(1);
		System.out.println(Calc2.result);
		
		// result�� ��������� ���� �����ϱ� ���� ó�� -> Test04 & Calc3
		
		
	}
}
