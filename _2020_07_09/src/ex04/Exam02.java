package ex04;

public class Exam02 {
	public static void main(String[] args) {
		// 생성자 호출은 서브클래스 -> 슈퍼클래스로 호출된다
		// 출력결과는 슈퍼 클래스부터 실행한 결과인데?
		// 이유: 생성자 첫 문장(super();)이 슈퍼클래스의 기본 생성자를 호출하는 문장임.
		//		개발자가 명시하지 않으면 컴파일러가 자동으로 넣는다.
		// 결론: 서브클래스 생성자가 호출되고 슈퍼 클래스로 따라 올라간다. 슈퍼 클래스부터 실행하면서 내려온다.
		SUV v = new SUV();
		Trike t = new Trike();
		System.out.println(t.muffler);
		
		
	}
}
