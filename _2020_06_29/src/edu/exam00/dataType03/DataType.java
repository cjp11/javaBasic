package edu.exam00.dataType03;
/*
 * DataType(자료형)
 * 변수를 선언할때 어떤 종류의 변수인가를
 * 자바 컴파일러한테 알려주는 약속
 * boolean 1byte true false  	논리
 * char	   2byte 유니코드	   	  	문자
 * byte	   1byte -128~127		정수
 * short   2byte -32768~32767	정수
 * int     4byte -21억~21억		정수
 * long    8byte -900경~900경 	정수
 * float   4byte 소수점 6자리 유효 	실수
 * double  8byte 소수점 15자리 유효   실수
 * String 						문자열
 * 
 *
 */

public class DataType {
	public static void main(String[] args) {
		boolean isVal = true;
		char ch = '한';
		char ch1 = 'A';
		byte bNum = 100;
		short sNum = 10000;
		int iNum = 1000_000_000;
		long lNum = 1_000_000_000_000L;
		float fNum = 3.14f;
		double dNum = 3.14;
		
		System.out.println(isVal);
		System.out.println(ch);
		System.out.println(ch1);
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println(fNum);
		System.out.println(dNum);
		
	}
}
