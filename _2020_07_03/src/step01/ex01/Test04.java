package step01.ex01;

//result�� ��������� ���� �����ϱ� ���� ó�� 
//��, ������ result���� ���´�. 

public class Test04 {
	
	
	public static void main(String[] args) {
		// ���: 3 - 5 + 7 + 2 = ?
		Calc3 calA = new Calc3();
		
		Calc3 calB = new Calc3();
		
		Calc3.plus(calA,3);
		Calc3.minus(calA,5);
		Calc3.plus(calA,7);
		Calc3.plus(calA,2);
		System.out.println(calA.result);
		
		
		Calc3.plus(calB,7);
		Calc3.plus(calB,3);
		Calc3.minus(calB,2);
		Calc3.minus(calB,1);
		System.out.println(calB.result);
		
		
		// result�� ��������� ���� �����ϱ� ���� ó�� 
		
		
	}
}
