package exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 
 * throw [Throwable ��ü]
 * Throwable -> java.lang.Throwable
 */
public class ex15 {

	public static void main(String[] args) {
		try {
			m();
			
		}catch(Throwable e) {
			System.out.println(e);
		}
	}
		// �ż��忡 � ������ ������ �� �ݵ�� �����ؾ� �Ѵ�.
		// [����Ÿ��] �޼����(�Ķ����...) throws ����Ÿ��, ����Ÿ��, ... {...}
		static void m() throws Throwable {
			throw new Throwable("����");
		}
		static void m2() throws Exception{
			throw new Exception("���� Ŭ����");
		}
		static void m3(int i) throws Exception, IOException, FileNotFoundException{
			if(i==0)
				throw new Exception();
			else if(i == 2)
				throw new IOException();
			else if(i == 3) 
				throw new FileNotFoundException();
		}
		static void m4(int i) throws Exception{	// m3() ó�� ���� Ŭ������ �� ���� �ʿ䰡 ���� �θ� Ŭ���� �ϳ��� ���ָ� ��.
			if(i==0)
				throw new Exception();
			else if(i == 2)
				throw new IOException();
			else if(i == 3) 
				throw new FileNotFoundException();
		}
	

}
