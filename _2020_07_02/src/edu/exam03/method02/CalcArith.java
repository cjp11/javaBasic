package edu.exam03.method02;
// 매서드
// 기능을 일정 영역으로 묶어 사용하기 쉽도록 만든것
// 일부 값은 변경되지만
// 논리가 동일한 코드가 반복될때 매서드를 만든다.
// 1) 코드 양이 줄어든다.
// 2) 한 눈에 파악
// 3) 매서드 내용만 수정하면 사용하는 모든 곳에 적용
// 4) 자동차 부품처럼 일부가 문제가 생기면 해당 부품(매서드)만 수정하거나 교체하면 됨.

//   리턴타입 매서드명(매개변수, ...) {
//		return 리턴타입 변수;
//	 }
public class CalcArith {

	public static void add(int a, int b) {
		int res = a + b;
		System.out.printf("%d + %d의 합은 [%d]\n", a, b, res);
	}
	
	public static void main(String[] args) {
		
		add(10,20);
		add(100,200);
		add(1000,2000);		

	}

}
