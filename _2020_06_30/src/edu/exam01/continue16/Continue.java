package edu.exam01.continue16;

public class Continue {

	public static void main(String[] args) {
		// 1���� 10���� 2�� ��� ���
		
		for(int i=1; i<11; i++) {	// i = i + 2�� �ΰ� i���� ����ص� ��.
			if(i%2 == 0) System.out.println(i);
		}
		
		for(int i=1; i<11; i++) {	
			if(i%2 != 0) continue;	// Ȧ���� 
				
			System.out.println(i);
		}

	}

}
