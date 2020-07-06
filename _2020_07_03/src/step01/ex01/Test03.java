package step01.ex01;

public class Test03 {
	
	
	public static void main(String[] args) {
		// 계산: 3 - 5 + 7 + 2 = ?
		
		Calc2.plus(3);
		Calc2.minus(5);
		Calc2.plus(7);
		Calc2.plus(2);
		System.out.println(Calc2.result);
		
		Calc2.result = 0; // 초기화
		Calc2.plus(7);
		Calc2.plus(3);
		Calc2.minus(2);
		Calc2.minus(1);
		System.out.println(Calc2.result);
		
		// result의 결과값들을 각각 저장하기 위한 처리 -> Test04 & Calc3
		
		
	}
}
