package step02;

public class Exam05 {

	public static void main(String[] args) {
		Board3 b1 = new Board3(); //<== Board3�� �⺻ ������ ȣ��
		//�⺻ �����ڰ� �ʱ�ȭ��Ų �ν��Ͻ� ������ ���ΰ�,
		//������ ������ �������� �ʱ�ȭ ��Ű��.
		b1.contents  ="�����Դϴ�.";
		b1.writer  ="ȫ�浿";
		
		//b1 ��ü�� �ν��Ͻ� ���� ���� �������
		// => b1 ���۷����� ����Ű�� ��ü
		// => b1 ���۷����� ����Ű�� �ν��Ͻ�
		// => b1 ���۷��� ������ ����� �ּ��� �ν��Ͻ� 
		System.out.println(b1.no);  //�����ڿ��� �ʱ�ȭ��Ŵ.
		System.out.println(b1.title); //�����ڿ��� �ʱ�ȭ��Ŵ.
		System.out.println(b1.contents);
		System.out.println(b1.writer);
		System.out.println(b1.createDate); //�����ڿ��� �ʱ�ȭ��Ŵ.
		System.out.println(b1.viewCount);  //�����ڿ��� �ʱ�ȭ��Ŵ.
		System.out.println(b1.passwd);  //�����ڿ��� �ʱ�ȭ��Ŵ.
		b1.set(5);
		System.out.println(b1.no); 
	}

}
