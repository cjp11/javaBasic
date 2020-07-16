package step02;

import java.util.Date;

/*
 * ����: Date Ŭ���� - java.util.Date
 */
public class Exam03_1 {

	public static void main(String[] args) {
		// 1) ���� �ð� �� ��¥ ������ ��������
		// 1970�� 1�� 1�� 0�� 0�� 0�ʺ��� ��������� ���帥 �ð���
		// 1/1000��(micro seconds)������ ������ �����Ѵ�.
		long currTime = System.currentTimeMillis();
		
		// 2)�и��ʸ� ��, ��, ��, ��, �� ������ �м�
		Date today = new Date(currTime);
		System.out.println("currTime: " + currTime);
		System.out.printf("%d-%d-%d %d:%d:%d\n",
				today.getYear()+1900, today.getMonth()+1,
				today.getDate(), today.getHours(),
				today.getMinutes(), today.getSeconds());
		
		// 3) �����ڿ� �ð��� �������� ������ ���� �ð��� �ڵ� ���ȴ�.
		today = new Date();
		System.out.printf("%d-%d-%d %d:%d:%d\n",
				today.getYear()+1900, today.getMonth()+1,
				today.getDate(), today.getHours(),
				today.getMinutes(), today.getSeconds());
	}

}
