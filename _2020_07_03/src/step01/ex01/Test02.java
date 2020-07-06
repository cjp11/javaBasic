package step01.ex01;

public class Test02 {
	
	
	public static void main(String[] args) {
		// 계산: 3 - 5 + 7 + 2 = ?
		
		Calc cal = new Calc();						// 생성 안하고 클래스로 접근하려면 Calc의 함수에 static 붙이고 
		int result = cal.minus(3,5);				// Cal.~~ 로 사용하면됨. 
		result = cal.plus(result,7);
		result = cal.plus(result,2);
		System.out.println(result);
		
	}
}
