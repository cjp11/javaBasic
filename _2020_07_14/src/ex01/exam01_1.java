package ex01;

import java.util.Calendar;

public class exam01_1 {

	public static void main(String[] args) {
		/*Calendar cal = new Calendar();*/	//Calendar�� �����ڰ� protected�� ����Ǿ� �־�(Ŭ���� ���ο����� ���ٰ���) 
											// Ŭ���� �ۿ��� ȣ���ϹǷ� ���� �Ұ�
											// Calendar�� ���� Ŭ������ ���� ��Ű�� �Ҽ� Ŭ������ �ƴϸ� , ����(ȣ��,����) ����
		Calendar cal = Calendar.getInstance();	
		// Calendar�� �� ������ ȣ���� �����ߴ°�?
		// -> �����ڸ� ȣ���� �� ������ "�޷�" ��ü�� ���� �� ����. 
		// -> ����?
		//	- �޷� ��ü�� �����ϴ� �ڵ尡 �����ϱ� ������
		//	- ��, �����ڰ� ���� �޷��� �����Ϸ��� System.currentTimeMillis()�� ����
		//	   ���� �ð� ������ �����ϰ�, �� ���� �ð��� ������ �޷� ��ü�� �����ؾ� �ϴµ�,
		//	   �׷� ���ŷο��� ���ֱ� ���� ������ ����ƽ �ż��带 ������ �ش�.
		Calendar cal2 = Calendar.getInstance();  // Calendar�� �ϳ����� ������ cal2, cal3 ���� �ٸ� ������
		for(int i=0,j=0; i<900_000_000;i++) {
			j++;
		}
		Calendar cal3 = Calendar.getInstance();	// ���ο��� currenTimeMillis ���� �ٸ��� ����.(������ ���� ���� �ٸ�)
		if(cal2 == cal3) {
			System.out.println("cal2==cal3");
		}
		System.out.println(cal);
		System.out.println(cal2);
	}

}
