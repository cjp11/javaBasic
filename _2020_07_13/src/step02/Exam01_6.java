package step02;

/*
 * 주제: String 클래스 - substring(), indexOf()
 * 
 */

public class Exam01_6 {

	public static void main(String[] args) {
		String str1 = "abcdefghijk";
		String str2 = str1.substring(4);
		String str3 = str1.substring(3,6);	// begin index, end index(이값은 포함되지 않는다)
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		// f 문자를 찾고 그 문자부터 2개의 문자를 출력해보자
		int i = str1.indexOf('f');
		String temp = str1.substring(i,i+2);
		System.out.println(temp);
		
		//def 문자열을 찾고 그 문자열 다음부터 출력해보자
		i = str1.indexOf("def");
		String s = "def";
		temp = str1.substring(i+s.length());
		System.out.println(temp);
	}

}
