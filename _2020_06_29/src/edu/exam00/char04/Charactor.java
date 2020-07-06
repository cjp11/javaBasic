package edu.exam00.char04;
// 문자는 정수(2진수)로 저장된다. 
public class Charactor {
	public static void main(String[] args) {
		char a = 'A';	// 아스키코드(유니코드 안에 포함된 분류)
		char b = '가';	// 유니코드(이 안에 아스키코드 분류가 있는 것)
		System.out.println(a);
		System.out.println(b);
		
		int ia = a;
		int ib = b;
		System.out.print("10진수 " +ia);
		System.out.printf(", 16진수 0x%02X%n", ia);
		System.out.print("10진수 " +ib);
		System.out.printf(", 16진수 0x%02X%n", ib);
		
		char c = (char)ia;
		char d = (char)ib;
		System.out.println(c);
		System.out.println(d);
		
		int k = 10;
		System.out.println(k);
		k = 0x10;				//16진수
		System.out.println(k);
		k = 010;				//8진수
		System.out.println(k);
		
	}
}
