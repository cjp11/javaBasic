package ex04;

public class User {
	String name;
	String email;
	String password;
	static int count;
	
	static {	// static ���: Ŭ������ �ε��� �� �ڵ����� ����Ǵ� ���
		System.out.println("User Ŭ���� �ε�");
	}
	
	static void increaseCount() {
		count++;	// ���� Ŭ������ �Ҽӵ� ���,
					// static ������ �ż��带 ����� �� Ŭ���� �̸� ���� ����.
	}
	 
}
