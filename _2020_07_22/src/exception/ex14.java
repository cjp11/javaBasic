package exception;

import java.io.FileOutputStream;

/*
 * try-with-resource
 */
public class ex14 {

	public static void main(String[] args) {
		try(	// �� ��ȣ �ȿ� ����� ��ü�� try ~ catch ~ ����� ������ ���� 
				// �ڵ����� close()�� ȣ���Ͽ� �ڿ� ������ �����Ѵ�.
				// �����ڰ� ���� finally ��Ͽ� �ڿ� ���� �ڵ带 �ۼ����� �ʾƵ� ��
				// java.lang.AutoClosable ����ü�� ���ؼ��� ������ �� �ִ�.
				FileOutputStream out = new FileOutputStream("exam090_13.dat");
			) {
			out.write(100);
		}catch(Exception e) {
			System.out.println("test");
		}
	}

}
