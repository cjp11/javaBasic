package edu.exam00.operator09;

public class BitShiftOp {

	public static void main(String[] args) {
		byte x = 10;	// 00001010
		
		System.out.println(x << 1);
		System.out.println(x << 2);
		System.out.println(x <<= 3);
		System.out.println(x);
		System.out.println();
		System.out.println(x >> 1);	// ������ �ֻ��� ��Ʈ�� ����Ʈ�ÿ� �ֻ�����Ʈ�� �״�� �������ش�. 
		System.out.println(x >> 2);
		System.out.println(x >> 3);
		
		byte y = -2;
		System.out.println(y >> 1);
		System.out.println(y << 2);
		System.out.println(y << 3);
		
		
		

	}

}
