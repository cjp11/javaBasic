package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
// fileIO 보다 약 400배 빠름 
public class fileIO_2 {
	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("jvms8.pdf");
		FileOutputStream out = new FileOutputStream("jvms8_2.pdf");
		
		long startMillis = System.currentTimeMillis();
		
		byte[] bytes = new byte[8192];	// 8192byte 단위로 처리 
		int len = 0;
		
		while((len = in.read(bytes)) != -1) {
			out.write(bytes,0,len);
		}
		long endMillis = System.currentTimeMillis();
		out.close();
		in.close();
		System.out.println(endMillis - startMillis);	
	}
}
