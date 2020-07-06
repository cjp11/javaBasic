package edu.exam02.array07;

//import java.util.Arrays;

/*
 * <���� ����>	-> ~.array06 �� ���� ���� ���� ����.  
 * �迭 ������ �ٸ� �迭 ������ �ִ� �迭 ������ ����
 * hashCode ���� ����ǹǷ� ���� �� ������ ����Ű�� �ȴ�.
 * �� ���� ���� ������ �迭 �������� ���� �����ϰ� �Ǹ�
 * ���� ������ ���� ������ �迭�� ���� �ٲ�� �ȴ�.
 * �� ���� �迭 ������ ���� ������ ����Ű�� �ȴ�.
 */

/*
 * <���� ����>
 * Array.copyOf�� ������ ������
 * ���� ���簡 �Ͼ��.
 * ���� ���� ������ ���ÿ� ���ο� ������ �Ҵ�Ǿ�
 * ������ ����ǹǷ� 2���� �迭 �������� ���� �ڽŵ��� ������ ����Ű�� �ȴ�.
 * �׷��Ƿ� 1���� �迭 ������ �ٸ� �迭 ������ ������ ��ġ�� �ʴ´�. 
 */

public class DeepCopy {

	public static int[] arraycopy (int[] score, int cnt){
		int[] ret = new int[cnt];
		
		for(int i=0; i<cnt; i++) {
			ret[i] = score[i];
		}
		
		return ret;
	}
	
	public static void main(String[] args) {
		int[] score0 = {10,20,30,40,50};
		int[] score1 = score0;
		int[] score2 = score0;
		
		// ��� ���� �ּ� ����.
		System.out.println(score0);
		System.out.println(score1);
		System.out.println(score2);
		
		score0[0] = 100;
		System.out.println(score0[0]);
		System.out.println(score1[0]);
		System.out.println(score2[0]);
		
		/* ���� ����(���ο� ������ �Ҵ�ǰ� score0�� ���� ���� ����. ��, 100 20 30 40 50 �� ���� �Ǿ�����. 
		int[] score3 = Arrays.copyOf(score0, score0.length);
		
		�̰��� �Ʒ� ó�� ���� �Լ��� ¥�� ���� ����. 
		*/
		int[] score3 = arraycopy(score0, score0.length);
		
		
		System.out.println();
		System.out.println(score0);
		System.out.println(score1);
		System.out.println(score2);
		System.out.println(score3);	// �ּҰ� �ٸ�. 
		
		score0[0] = 1000;
		System.out.println(score0[0]);
		System.out.println(score1[0]);
		System.out.println(score2[0]);
		System.out.println(score3[0]);
	}

}
