package step01.ex01;

public class Exam02_2 {

	public static void main(String[] args) {
		Calc c = new Calc(); 
		
		c.plus(10);
		c.plus(20);
		System.out.println(c.result);
		
		// 새로운 요구사항:
		// 1) 배열의 값을 더하는 기능이 필요!
		
		int[] values = {10,20,30,40};
		Calc2 c2 = new Calc2();
		c2.plusArray(values);
		c2.plus(150);
		c2.plusTwin(50,80);
		System.out.println(c2.result);
		
		Calc3 c3 = new Calc3();
		c3.plus(values);		// C++에서는 내부에서 알맞는 함수 형태로 바꿔 적용시킴
		c3.plus(150);
		c3.plus(50,80);
		System.out.println(c3.result);
	}

}
