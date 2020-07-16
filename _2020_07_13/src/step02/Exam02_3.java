package step02;
/*
 * StringBufer 클래스 - replace(), delete(), insert()
 */
public class Exam02_3 {

	public static void main(String[] args) {
		StringBuffer b1 = new StringBuffer("abcdefghijk");
		StringBuffer b2 = b1.replace(3,6,"xoxo");
		
		if(b1 == b2) {	// 같은 것을 가르키는 군
			System.out.println("b1==b2");
		}
		System.out.println(b1);
		b1.delete(3,6);
		System.out.println(b1);
		b1.insert(3,"XXX");
		System.out.println(b1);
		System.out.println(b2);
		
	}

}
