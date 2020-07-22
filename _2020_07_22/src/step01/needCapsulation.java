package step01;

public class needCapsulation {

	public static void main(String[] args) {
		// 병원의 환자를 "Patient"라는 클래스로 추상화(데이터화) 시킨다.
		Patient p = new Patient();
		p.name = "임꺽정";
		/*	...
		 * 	...
		 * 	...
		 * 	.
		 * 	.
		 * 	.
		 * 
		 * p.age = 300;
		 * p.height = -30;
		 * -> 환자 데이터로서 신뢰성 상실
		 * -> Patient를 추상화시킨 의미가 상실
		 * 
		 * 
		 * 
		 * <Solution> -> 클래스 내부에서 sum, avg를 private로 선언
		 * sum과 avg 변수에 대해 임의 접근하는 것을 막음으로써
		 * sum과 avg 값의 신뢰성은 보장받는다
		 * 따라서 Score 클래스를 정의한 목적(추상화)대로 사용할 수 있다.
		 */
		
		
		/*
		 * getter(게터메서드)
		 * -> getSum(),getAvg와 같이 인스턴스 변수의 값을 꺼내주는 매서드를 말한다.
		 * 이 매서드들에서 sum , avg 값을 리턴함. main 함수에서 호출해줌. 
		 * 
		 * 
		 * setter(세터메서드)
		 * -> setAge() 와 같은 메서드를 말한다.
		 * -> 외부에서 인스턴스 변수에 직접 접근하는 대신 이 메서드를 호출하여 값을 저장한다. 
		 * -> 메서드 내부에서 유효한 값인지 검증한 후 인스턴스 변수에 저장한다.
		 * -> 유효하지 않은 값을 넣는 것을 방지할 수 있다.
		 * 
		 * 캡슐화(encapsulation)
		 * -> 중요한(critical) 멤버(변수 또는 메서드)의 직접 접근을 차단하여
		 *    유효하고 적절한 데이터만 들어가도록 함으로써 데이터의 신뢰성을 높인다.
		 * -> 유효하지 않은 데이터가 들어가는 것을 방지함으로써 추상화가 무너지지 않게 한다.
		 * -> 특히 중요한 변수는 setter와 getter 메서드를 사용하여 간접적으로 값을 넣고 꺼내게 만든다. 
		 */
	
	}

}
