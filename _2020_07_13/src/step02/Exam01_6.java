package step02;

/*
 * ����: String Ŭ���� - substring(), indexOf()
 * 
 */

public class Exam01_6 {

	public static void main(String[] args) {
		String str1 = "abcdefghijk";
		String str2 = str1.substring(4);
		String str3 = str1.substring(3,6);	// begin index, end index(�̰��� ���Ե��� �ʴ´�)
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		// f ���ڸ� ã�� �� ���ں��� 2���� ���ڸ� ����غ���
		int i = str1.indexOf('f');
		String temp = str1.substring(i,i+2);
		System.out.println(temp);
		
		//def ���ڿ��� ã�� �� ���ڿ� �������� ����غ���
		i = str1.indexOf("def");
		String s = "def";
		temp = str1.substring(i+s.length());
		System.out.println(temp);
	}

}
