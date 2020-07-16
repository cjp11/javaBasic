package step02;
/*
 * ����: StringBuffer Ŭ����
 * buffer?
 * -> �����͸� �����ϴ� �޸� ����. ���� �迭�� �����.
 * cache?
 * -> �����͸� ����ϴ� �޸� ����. ���� �ϵ� ��ũ�� �ӽ� ����
 */
public class Exam02_1 {

	public static void main(String[] args) {
		StringBuffer buf1 = new StringBuffer("hello");
		
		// StringBuffer�� Mutable ��ü�̴�.
		// -> �����͸� ������ �� �ִ�.
		// -> ��� ���ڿ��� �����ؾ� �ϴ� �����͸� ���� �� ����� �� �ִ�.
		
		buf1.append(", world!");
		System.out.println(buf1);
		

	}

}

/*
 * String vs StringBuffer vs StringBuilder ?
 * 1) Immutable vs Mutable
 * -> String�� Immutable ��ü�μ� �����͸� ������ �� ����.
 * -> StringBuffer�� StringBuilder�� Mutable ��ü�μ� �����͸� ������ �� �ִ�.
 * 2) Thread-safe ����
 * -> StringBuffer�� thread-safe�ϴ�. ��, ���� �����尡 ���ÿ� �����ϴ���,
 * 	   �� ���� �� �����常�� �����͸� �����ϵ��� �������ش�.
 * -> StringBuilder�� thread-safe���� �ʴ�. ��, ���� �����尡 ���ÿ� �����Ͽ� 
 * 	   ���� �ٲܼ� �ִ�. �����Ͱ� ��ġ���� �ʴ� ������ �߻��Ѵ�.
 * */
