package step02;
/*
 * ����: String Ŭ���� - Literal String �ν��Ͻ��� �Ϲ� String �ν��Ͻ�
 * 
 * ���漳��
 * https://study.com/academy/lesson/java-string-constant-pool-concept-mechanism.html
 * https://www.journaldev.com/797/what-is-java-string-pool
 */
public class Exam01_3 {

	public static void main(String[] args) {
		// �Ϲ� String �ν��Ͻ� ����: heap ������ �ν��Ͻ��� ����
		// -> ������ �÷����� ��� : �������� �Ǹ� �޸� ����
		// -> �Ϲ� �ν��Ͻ��̴�.
		
		String s1 = new String("hello");
		
		// Literal String �ν��Ͻ� ����: constant string pool�� ����
		// -> JVM�� ������ ������ �����ȴ�.
		// -> �ߺ��� ������� �ʴ� �ν��Ͻ�. �ߺ� �������� �ʴ´�.
		// -> �޸𸮸� �� �� ȿ�������� ����ϱ� ����
		String s2 = "hello"; 	// new String("hello"); �� ����� ����.
		
		if(s1 == s2) {	// ���� �ٸ� String �ν��Ͻ����� ����
			System.out.println("s1 == s2");
		}
		if(s1.equals(s2)) {
			System.out.println("s1.equals(s2)");
		}
		
		String x1 = new String("hello");
		String x2 = "hello";	// �̹� constant string pool�� "hello" String �ν��Ͻ��� �����ϱ� ������,
								// ���� �������� �ʰ� �ν��Ͻ��� �ּҰ� ���ϵ�.
		if(s1 == x1) {			// heap�� ������ �ν��Ͻ��� �ٸ���.	
			System.out.println("s1 == s2");
		}
		if(s2 == x2) {			// constant string pool�� ������ �ν��Ͻ��� ����.
			System.out.println("s1 == s2");
		}
		String x3 = "hello";
		if(x2 == x3) {
			System.out.println("x2 == x3");
		}
	}

}

/*
 * 
 * 
 * */
