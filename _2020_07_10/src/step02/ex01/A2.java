package step02.ex01;

public class A2 extends Object{
	int var1 = 100;
	//1) toString() 재정의
	// -> toString()은 인스턴스의 간략한 정보를 리턴한다.
	// -> Object로부터 상속받은 오리지널 매서드는 사용하는 용도가 우리와는 맞지 않다.
	// -> 의미 있는 문자열을 리턴하도록 재정의 하자.
	public String toString() {
		return "A[var1=" + var1 +"]";
	}
	
	public boolean equals(Object obj) {
		A2 other = (A2)obj;
		if(this.var1 == other.var1) {
			return true;
		}
		return false;
	}
}
