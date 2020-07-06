package edu.exam00.operator09;

public class BitOp {
	public static void main(String[] args) {
		int x = 21;
		int y = 17;
		System.out.println(x & y);
		System.out.println(x | y);
		System.out.println(x ^ y);
		System.out.println(~x);	//1ÀÇ º¸¼ö
		
		int r = ~y + 1;
		System.out.println(r);
		r = ~r + 1;
		System.out.println(r);
		
	}
}
