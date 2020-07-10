package step01.ex01;

public class Car extends Motor{
	int capacity = 20;
	
	Car() {
		//System.out.println(capacity);		// 출력결과 20 , 즉 인스턴스 변수 초기화가 생성자보다 우선 수행됨
		capacity = 4;
	}
}
