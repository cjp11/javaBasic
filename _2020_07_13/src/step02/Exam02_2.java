package step02;
/*
 * StringBuffer는 equals()를 재정의 하지 않았다.
 */
public class Exam02_2 {

	public static void main(String[] args) {
		StringBuffer b1 = new StringBuffer("hello");
		StringBuffer b2 = new StringBuffer("hello");
		
		if(b1.equals(b2)) {		// 출력이 되지 않으므로 같지 않다는 의미
			System.out.println("b1.equals(b2)");
		}

	}

}
