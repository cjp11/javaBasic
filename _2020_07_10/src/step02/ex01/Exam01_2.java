package step02.ex01;

/*
 * Object Ŭ���� - toString(), hashCode(), equals(), getClass()
 * ->toString(): '�ν��Ͻ�'�� ���� ����
 * - �⺻: Ŭ����@�ν��Ͻ��ĺ���ȣ(hashcode)
 * - �ν��Ͻ��� ���� ������ ������ �� ����Ѵ�.
 * - �⺻���� ����ϴ� ������ ����ϴµ� ���ǹ� �� �� �ִ�.
 * - ���� �ȵ�� �������ؼ� ����Ѵ�.
 * 
 * ->hashCode(): '�ν��Ͻ�'�� �ĺ� �ڵ� ����
 * - �ν��Ͻ��� �ʿ� ������ �� �±׷� ����Ѵ�.
 * - �ν��Ͻ����� ���� ���� �� ����Ѵ�.
 * 
 * ->equals(): �� '�ν��Ͻ�'�� �� ����� ����
 * - �⺻: ���� �ν��Ͻ��̸� True, �ƴϸ� false
 * 
 * ->getClass(): '�ν��Ͻ�'�� � Ŭ�������� �� ������ �����Ѵ�.
 * 
 * ->finalize(): ������ �÷��Ͱ� �ν��Ͻ��� �޸𸮿��� �����ϱ� ���� ȣ���ϴ� �޼���.
 * 				 �� �ż��忡���� ���� �ν��Ͻ��� ����ߴ� �ڿ��� ������Ű�� �۾��� �Ѵ�.
 * 				 �׷��� ������ �÷��Ͱ� ���� ȣ��� �� �� �� ����,
 * 				 ���α׷��� ����� ������ �޸𸮰� �������� �ʴٸ� ������ �÷��Ͱ� ������� 
 * 				 �ʱ� ������, ���α׷��� ����� ������ finalize()�� ȣ����� ���� ���� �ִ�.
 * 				 ����, �ǹ����� �ν��Ͻ��� ����� �ڿ��� ������Ű�� ���� ������δ� 
 *  			finalize() �ż��� �����Ǹ� ������� �ʴ� ���� ����. 
 */


public class Exam01_2 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		A r1 = new A();		// new A:  A �ּҰ� ������ ���� �޸𸮿� Ŭ������ �ε��ϴ� �۾� + () ȣ���ϴ� �κ�
		A r2 = new A();
		//Object 
		System.out.printf("r1.toString(): %s\n", r1.toString());
		System.out.printf("r1.hashCode(): %s\n", Integer.toHexString(r1.hashCode()));
		System.out.printf("r2.toString(): %s\n", r2.toString());
		System.out.printf("r2.hashCode(): %s\n", Integer.toHexString(r2.hashCode()));
		//r1.toString(): step02.ex01.A@15db9742
		// 15~~ �� �ؽ��ڵ�
		// ������ �ּҸ� ���ο��� ��ȯ���� �ٸ� ���·� ������.
		// r1 �� 100������ ����Ǵ°��̾ƴ�
		// hashcode(100) -> output�� �ٸ� ������ ��ȯ�Ǿ� ���ϵǴµ� �� ������ �ּҸ� ã�ư�.
		// �� ������ ������ �ش� �ּҿ� ������ �� ������ �����ϰ� �ϱ� ���� ó���ε� ����. 
		
		if(r1 == r2) {
			System.out.println("r1==r2");
		}
		if(r1.equals(r2)) {
			System.out.println("r1.equals(r2)");
		}
		
		Class c1 = r1.getClass();	//r1�� �ּҸ� ������
		Class c2 = r2.getClass();
		System.out.println(c1);
		System.out.println(c2);
		if(c1 == c2) {
			System.out.println("c1==c2");
		}
		/*
		Object p =r1.getClass();	// ������ �����ϰ� ��. read only. �ѹ� �÷�����. �Ʒ�ó�� cast �ϸ� ������. 
		A pp = (A)p;
		pp.var1 = 300;
		System.out.println(pp.var1);
		*/
		System.out.println(c1.getName());
		// ���赵�� �ִٸ� �ν��Ͻ��� ������ �� �ִ�.
		A r3 = (A)c1.newInstance();
	}

}
