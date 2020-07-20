package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileIO {

	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("jvms8.pdf");
		FileOutputStream out = new FileOutputStream("jvms8_2.pdf");
		
		long startMillis = System.currentTimeMillis();
		int b;
		while((b = in.read()) != -1) {	// 1byte�� �о��
			out.write(b);
		}
		
		long endMillis = System.currentTimeMillis();
		out.close();
		in.close();
		System.out.println(endMillis - startMillis);

	}

}
