package step02;
/*
 * ���� String Ŭ���� - intern(): �Ϲ� String �ν��Ͻ��� ���� ������ ��� ��Ʈ�� Ǯ�� �����Ѵ�. 
 * 
 */
public class Exam01_4 {

	public static void main(String[] args) {
		String s1 = new String("hello");
		
		String s2 = s1.intern();	// ���Ǯ�� s1 ���� �����ؾ� intern()�� ����� �� ����. 
		String s3 = "hello";		// ��� ��Ʈ�� Ǯ�� String �ν��Ͻ��� �����϶�
									// �̹� ������ ��� ��Ʈ�� Ǯ�� �ش� ���� ���� �ν��Ͻ��� �����ϰ� �ִ�. 
		
		if(s2 == s3) {
			System.out.println("s2 == s3");
		}
		String s4 = new String("hello");
		String s5 = s4.intern();
		if(s3 == s5) {
			System.out.println("s3 == s5");
		}
		

	}

}
