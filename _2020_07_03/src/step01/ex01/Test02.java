package step01.ex01;

public class Test02 {
	
	
	public static void main(String[] args) {
		// ���: 3 - 5 + 7 + 2 = ?
		
		Calc cal = new Calc();						// ���� ���ϰ� Ŭ������ �����Ϸ��� Calc�� �Լ��� static ���̰� 
		int result = cal.minus(3,5);				// Cal.~~ �� ����ϸ��. 
		result = cal.plus(result,7);
		result = cal.plus(result,2);
		System.out.println(result);
		
	}
}
