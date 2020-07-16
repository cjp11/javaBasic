package step02;

import java.sql.Date;

class A{
	int var = 100;
	public String toString() {				// overriding
		return "A[var: " + var + "]";
	}
	
}


public class Exam03_2 {

	public static void main(String[] args) {
		Object obj = new Object();
		A test = new A();
		System.out.println(obj);		// toString이 값을 만들어줌.
		System.out.println(test);
		
		long currTime = System.currentTimeMillis();
		Date today = new Date(currTime);
		// 같은 이름의 클래스를 동시에 사용하고 싶다면,
		// 한 클래스의 이름은 전체 이름(패키지명을 포함한 이름)으로 지정한다.
		java.util.Date today2 = new java.util.Date(currTime);
		
		
		System.out.println(today);
		System.out.println(today2);
	}

}
