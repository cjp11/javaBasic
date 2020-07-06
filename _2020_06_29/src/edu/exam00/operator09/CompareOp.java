package edu.exam00.operator09;

public class CompareOp {

	public static void main(String[] args) {
		int x = 10, y = 20;
		
		boolean r = x==y;
		
		System.out.println(r);
		r = x != y;
		System.out.println(r);
		System.out.println(x > y);	// r = x>y ; System.out.println(r); 로 해도 마찬가지. 속도는 전자가 빠름(레지스터로 바로 값이 저장되서 사용되므로)
		System.out.println(x < y);
		System.out.println(x <= y);
		System.out.println(x >= 2);
		System.out.println(!true);
		System.out.println(!false);

	}

}
