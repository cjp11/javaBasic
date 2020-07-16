package step02;
/*
 * 주제: String 클래스 - String 클래스가 없다면
 * -> Char 배열을 사용하여 문자열을 저장하고 꺼내야 한다. 
 * 
 */

public class Exam01_1 {

	public static void main(String[] args) {
		// "Hello, world!" 문자열 저장하기
		char[] str = {'H','e','l','l','o',' ','w','o','r','l','d','!'};
		
		for(char c : str) {
			System.out.print(c);
		}
	}

}
