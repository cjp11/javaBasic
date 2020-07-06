package edu.exam00.operator08;

public class AddSubOp {

	public static void main(String[] args) {
		int num = 0;
		// 후위 증가 (현재 값으로 적용하고 끝나면 증가)
		System.out.println(num++);
		System.out.println(num);
		
		// 전위 증가 (증가부터 시켜라)
		num = 0;
		System.out.println(++num);
		System.out.println(num);

	}

}
