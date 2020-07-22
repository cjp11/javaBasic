package exception;

import java.io.FileOutputStream;

/*
 * try-with-resource
 */
public class ex14 {

	public static void main(String[] args) {
		try(	// 이 괄호 안에 선언된 객체는 try ~ catch ~ 블록을 나가기 전에 
				// 자동으로 close()를 호출하여 자원 해제를 수행한다.
				// 개발자가 직접 finally 블록에 자원 해제 코드를 작성하지 않아도 됨
				// java.lang.AutoClosable 구현체에 대해서만 적용할 수 있다.
				FileOutputStream out = new FileOutputStream("exam090_13.dat");
			) {
			out.write(100);
		}catch(Exception e) {
			System.out.println("test");
		}
	}

}
