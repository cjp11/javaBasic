package ex03;

import java.util.ArrayList;

public class exam01_5 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		
		names.add("ȫ");
		names.add("ȫ");		//���� ���� ��ü(�� �ּ�)����
		names.add(null);	//null�� ���� ����
		names.add("��");
	
		for(int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		for(String s : names) {
			System.out.println(s);
		}
	}
	
	

}
