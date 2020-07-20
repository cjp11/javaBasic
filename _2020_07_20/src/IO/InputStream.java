package IO;
/*
 * IOStream		-> ���� ������ ó���� ����(binary �����̹Ƿ�)
 * fileReader, fileWriter  -> �ַ� '����' ó�� �뵵
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStream {

	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("Exam11.dat");
		byte[] bytes = new byte[1024];		// 1024����Ʈ ������ ó��
		
		int i = 0;
		int b;
		while(true) {
			b = in.read();
			if(b==-1) {		// �� ���� �����Ͱ� ���ٸ� 
				break;
			}
			bytes[i++] = (byte)b;
		}
		
		in.close();
		System.out.println("�о����ϴ�.");
		
		for(int x = 0 ; x < i; x++) {
			System.out.printf("%d ", bytes[x]);
		}
		System.out.println();
	}

}
