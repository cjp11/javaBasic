package ex03;

import java.util.ArrayList;
import java.util.Date;

public class exam01_4 {

	public static void main(String[] args) {
		/*
		ArrayList names = new ArrayList();
		names.add("ȫ");				//// new String("ȫ")
		names.add(new Date());		
		names.add(new Integer(20));	
		names.add(true);			// new Boolean(true) 
		// ��� Ÿ���� ���� ���� �� �ִ� = ������Ʈ Ŭ������ �����Ѵ�
		// ��ڽ� ��.
		// �����ε�
		
		
		
		//������: Ư�� Ÿ���� ��ü(�� �ּ�)�� �����ϰ� ������ �װ��� ���� ����� ����.
		//�ذ�å: � Ÿ���� ��ü�� ������ �� ��������.
		System.out.println("----------------");
		for(int x=0; x<names.size(); x++) {
			System.out.println(names.get(x));	
		}
		*/
		
		// 2) ���׸� ���
		// -> ArrayList�� ���� �������� Ÿ���� �����Ѵ�.
		// -> ArrayList<String> names2 = new ArrayList<String>();
		ArrayList<String> names2 = new ArrayList<String>(); //ArrayList<String> names2 = new ArrayList<>(); �� ����ص� ���� �ǹ�
															// new ��� ������ Ÿ�� ������ ������ �� �ִ�.
		names2.add("ȫ�浿");						// ��� ��Ʈ�� ��ü�� �ּҸ� ����
		names2.add(new String("�Ӳ���"));			// �Ϲ� ��Ʈ�� ��ü�� �ּҸ� ����
		
		//names2.add(new Integer(2)); �Ұ���. ������ ����. ������ Ÿ���� �ƴϸ� ���� �Ұ�
		//names2.add(new Date());
		// ���׸� ��� ����: ������ Ÿ�� �ܿ� �ٸ� Ÿ���� ��ü�� ���� �� �� ����.
		//				�װ͵� ���� �� ������ �ܰԿ��� �˻��Ѵ�. -> ������ ���� ���� �� �ִ�.
		//				�������� �ǵ��� ���Ͽ� �����ϴ� ���� �ּ�ȭ �� �� �ִ�. -> ���α׷� �������� ��������. 
	}

}
