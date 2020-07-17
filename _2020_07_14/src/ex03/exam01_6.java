package ex03;

import java.util.HashSet;

/*
 *  HashSet
 *  -> ���� �����ϴ� ��Ģ.
 *  -> ������ ���� ���� ��ü�̴�. �� ���� ���� �ߺ� �������� �ʴ´�.
 *  - �ߺ� ���� �� ���
 *  => hashCode�� ���� ���� ����,
 *  => equals()�� ���� ���� true��� ���� ������ ����Ѵ�.
 *  -> null�� ���� ����
 *  -> ���� �� ����� ������� ���� �� ����.
 * 
 */
public class exam01_6 {

	public static void main(String[] args) {
		HashSet<String> names = new HashSet<>();
		
		names.add("ȫ�浿");
		names.add("ȫ�浿");	
		names.add(null);
		names.add("��");
		names.add(null);	// �ߺ� ���� �ȵ�
		names.add("��");		// �ߺ� ���� �ȵ�
		names.add("��");
		names.add(new String("ȫ�浿"));	// �ν��Ͻ��� �ٸ����� �ұ��ϰ� �ߺ����� ���ֵȴ�.
		// ������? hashCode()�� ���� ���� ����, equals ���� ����� true�̱� �����̴�.
		
		for(String s: names) {
			System.out.println(s);
		}
		
		Object[] arr = names.toArray();
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("-------------");
		System.out.printf("ȫ�浿: %d\n", "ȫ�浿".hashCode());
		System.out.printf("ȫ�浿: %d\n", new String("ȫ�浿").hashCode());
		System.out.printf("�Ӳ���: %d\n", "�Ӳ���".hashCode());
		System.out.printf("ȫ�浿.equals(other) %b\n", "ȫ�浿".equals(new String("ȫ�浿")));
		
	}

}

/*
 * HashSet�� �� ���� ����?
 * -> �ε����� ������� �ʰ�, �ν��Ͻ��� �ؽ��ڵ带 ����Ͽ� �� ���� ��ġ�� �����Ѵ�.
 * -> �׷��� ���� ������ �ν��Ͻ��� �ؽ� ���� �����Ѵ�.
 * 
 * �ؽ� ��(hash code)?
 * -> ��ü �Ǵ� ���� �ĺ��ϱ� ���� �ο��� ���� ��ȣ.
 * -> Ư���� ��� ����(�˰���)�� ���� �� �ν��Ͻ��� ���� ���� �ο��Ѵ�.
 */

