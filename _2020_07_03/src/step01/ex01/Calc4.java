package step01.ex01;
// 객체로 접근하기 위한 처리. 
public class Calc4 {
	int result = 0;
	void minus( int a) {	// static을 빼면, Calc4 inst 인자를 받을 필요없음
		result -= a;
	}
	void plus(int a) {
		result += a;
	}
	
	
}
