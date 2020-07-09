package ex04;

public class SUV extends Car{
	int weight;
	public SUV() {
		super();	// 슈퍼클래스의 기본 생성자를 호출하는 명령 (숨겨져 있음)
		System.out.println("SUV() 호출됨");
	}
}
