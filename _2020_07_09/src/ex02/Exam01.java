package ex02;

public class Exam01 {

	public static void main(String[] args) {
		Calculator calc = null;
		// �ν��Ͻ��� ������� �ʴ� �ż��带 ȣ���ϴ���
		// �� �ż��尡 �ν��Ͻ� �ż����� ���
		// ������ ��ȿ�� �ν��Ͻ� �ּҸ� �Ѱܾ� �Ѵ�.
		// �ν��Ͻ� �ּҰ� null�̴�. ���� ���� ����
		
	//	calc.plus(3);		//�ּҰ��� ���µ� ��F�� �˰� plus�� �����ϴ°�?
							//�����Ϸ��� ������ �ȳ��� ����: calc�� Calculator Ÿ���� ���� �Լ� ��ġ�� �ƴ� ��
		calc = new Calculator();
		calc.plus(3);
		calc.plus(7);
		calc.minus(5);
		System.out.println(calc.result);
	}

}
