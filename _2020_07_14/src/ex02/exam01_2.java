package ex02;

public class exam01_2 {

	public static void main(String[] args) {
		int i = 10;
		Integer obj3 = new Integer(i);
		
		String str = obj3.toString();	// ���ڸ� ���ڿ��� ����� ����(�������̵� �غ���)
		System.out.println(str);
		
		int value = obj3.intValue();	// �� �������� �Լ�. �׷�����.
		System.out.println(value);
		
		float f = obj3.floatValue();	// �ٸ� Ÿ���� ������ ��ȯ�Ͽ� ����
		System.out.println(f);
		
		String str2 = Integer.toHexString(375);		// �Է� ���� int���� 16������ ǥ���� ���ڿ��� ����
		System.out.println(str2);
		
		int val2 = Integer.parseInt("123");	// �Է� ���� ���ڿ��� int������ �ٲ� ����
		System.out.println(val2);
	}

}
