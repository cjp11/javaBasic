package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fileInputStream {

	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("fileOut.dat");
		
		byte[] bytes = new byte[1024];
		int len = in.read(bytes);
		
		in.close();
		System.out.println("�о����ϴ�.");
		
		for(int x = 0; x<len; x ++) {
			System.out.printf("%d ", bytes[x]);
		}
		System.out.println();
	}

}
