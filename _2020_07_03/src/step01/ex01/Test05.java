package step01.ex01;

// ��ü�� �����ϸ� Calc4 ��������( static���� ���). 

public class Test05 {
	
	
	public static void main(String[] args) {
		// ���: 3 - 5 + 7 + 2 = ?
		Calc4 calA = new Calc4();
		
		Calc4 calB = new Calc4();
		
		calA.plus(3);
		calA.minus(5);
		calA.plus(7);
		calA.plus(2);
		System.out.println(calA.result);
		
		
		calB.plus(7);
		calB.plus(3);
		calB.minus(2);
		calB.minus(1);
		System.out.println(calB.result);
		
		
		
		
		
	}
}
