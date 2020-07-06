package edu.exam00.transtype05;
//자동 형 변환
// 1) 사이즈 작은 것 -> 큰 것에 맞춰진다.
// 2) 정수(표현 범위 적은것) -> 실수(표현 범위 큰 것)
public class AutoTransType {
	public static void main(String[] args) {
		//ch 값이 i로 변환되어 대입 된다.
		char ch = 'A';
		int i = ch;
		System.out.println(i);
		
		byte b = 100;
		int n = 100;
		System.out.println(b*n);	// b가 int로 자동 변환되어 연산)
		
			
		int r = 3;
		double pi = 3.14d;
		System.out.println(r*r*pi);	// r이 double로 자동 변환
		
		byte x = 100;
		byte y = 100;
		System.out.println(x*y);	// 오버플로우 일어나지 않음. 연산될 때 형이 변환되는 것이 아니라
									// 무조건  int형으로 인식을 하고 계산(연산이 일어날때 디폴트 값이 int이기 때문에)
									// C언어에서는 큰사이즈 타입을 따라가는데 Java와 다름을 인식!
	}
}
