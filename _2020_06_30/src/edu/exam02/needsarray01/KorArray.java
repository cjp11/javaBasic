package edu.exam02.needsarray01;

public class KorArray {

	public static void main(String[] args) {
		int[] kor = {99,98,80}; //�Ҵ��� �� ���¿����� ���� ���� �� ����. 
								// ��, int[] kor = new int[3];
								// kor[0] = 99; ... �̷��� �� �� ����. ����� ���ÿ� �ʱ�ȭ ������Ѵ�.
		int sum = 0;
		float avg = 0f;
		/*
		int[] eng = new int[5];
		
		kor = eng; // ����, type ��, ����� �����Ƿ�, C������ �Ұ��� ���� ������ �������� ������ ������. 	
					// �̷��� �ع����� ���� 99 98 80���� ���߿� ������ ������ �÷����� �˾Ƽ� ó����. 
		kor[0] = 1;
		kor[1] = 4;
		kor[4] = 6;
		
		System.out.println(kor[4]);
		System.out.println(kor.length);
		System.out.println(eng.length);
		System.out.println(eng[1]);
		*/
		// 
		sum = kor[0] + kor[1] + kor[2];
		avg = (float)sum / 3;
		System.out.printf("����: %d, ���: %.2f\n",sum,avg);
	}

}
