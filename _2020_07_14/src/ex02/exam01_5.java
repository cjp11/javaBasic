package ex02;
/*
 * ���� ��ڽ�
 * -> �ν��Ͻ��� ���� �ڵ����� ���� �ִ� ��.
 */
public class exam01_5 {

	public static void main(String[] args) {
		Integer obj = new Integer(30);
		
		int value = obj.intValue();
		int value2 = obj;	// �ڵ����� intValue()�� ȣ��Ǿ� �� ���� ���� value2�� ����ȴ�.
							// �ڽ��� ����� �����͸� Ǭ�ٶ�� �ǹ̿��� �����ڽ��̶� �θ���.
		
		// ����
		// 1)���� �ڽ��� ��
		Integer obj2 = 10;	//new Integer(10);
		Object obj3 = 10;	//new Integer(10);  ObjectŬ������ ����Ŭ������ ������ �˰� �ִ�(�ּҸ� �˰��ִ�)
		
		//2) ���� ��ڽ�
		int value3 = obj2;
		//int value4 = obj3;	// Object Ÿ�Կ� ���ؼ��� ���� ��ڽ��� �ڵ����� �Ͼ�� �ʴ´�.
		int value4 = (Integer)obj3;	// ����ȯ ���־����.. 
		int value5 = (int)obj3;	//���� ���� Ÿ������ ����ȯ�� �� �� �ִ�.
								// (��, obj3�� Integer ��ü�� ����Ǿ��ٴ� �����Ͽ�)
	}

}
