package step01;

public class needCapsulation {

	public static void main(String[] args) {
		// ������ ȯ�ڸ� "Patient"��� Ŭ������ �߻�ȭ(������ȭ) ��Ų��.
		Patient p = new Patient();
		p.name = "�Ӳ���";
		/*	...
		 * 	...
		 * 	...
		 * 	.
		 * 	.
		 * 	.
		 * 
		 * p.age = 300;
		 * p.height = -30;
		 * -> ȯ�� �����ͷμ� �ŷڼ� ���
		 * -> Patient�� �߻�ȭ��Ų �ǹ̰� ���
		 * 
		 * 
		 * 
		 * <Solution> -> Ŭ���� ���ο��� sum, avg�� private�� ����
		 * sum�� avg ������ ���� ���� �����ϴ� ���� �������ν�
		 * sum�� avg ���� �ŷڼ��� ����޴´�
		 * ���� Score Ŭ������ ������ ����(�߻�ȭ)��� ����� �� �ִ�.
		 */
		
		
		/*
		 * getter(���͸޼���)
		 * -> getSum(),getAvg�� ���� �ν��Ͻ� ������ ���� �����ִ� �ż��带 ���Ѵ�.
		 * �� �ż���鿡�� sum , avg ���� ������. main �Լ����� ȣ������. 
		 * 
		 * 
		 * setter(���͸޼���)
		 * -> setAge() �� ���� �޼��带 ���Ѵ�.
		 * -> �ܺο��� �ν��Ͻ� ������ ���� �����ϴ� ��� �� �޼��带 ȣ���Ͽ� ���� �����Ѵ�. 
		 * -> �޼��� ���ο��� ��ȿ�� ������ ������ �� �ν��Ͻ� ������ �����Ѵ�.
		 * -> ��ȿ���� ���� ���� �ִ� ���� ������ �� �ִ�.
		 * 
		 * ĸ��ȭ(encapsulation)
		 * -> �߿���(critical) ���(���� �Ǵ� �޼���)�� ���� ������ �����Ͽ�
		 *    ��ȿ�ϰ� ������ �����͸� ������ �����ν� �������� �ŷڼ��� ���δ�.
		 * -> ��ȿ���� ���� �����Ͱ� ���� ���� ���������ν� �߻�ȭ�� �������� �ʰ� �Ѵ�.
		 * -> Ư�� �߿��� ������ setter�� getter �޼��带 ����Ͽ� ���������� ���� �ְ� ������ �����. 
		 */
	
	}

}