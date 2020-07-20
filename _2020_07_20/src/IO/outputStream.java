package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class outputStream {

	public static void main(String[] args) throws IOException {
		FileOutputStream out = new FileOutputStream("Exam11.dat");
	//	File f = new File("Exam11.dat");
		//FileInputStream in = new FileInputStream(f);
		
		byte[] bytes = {10,20,30,40,50,60,70,80,90,100};
		
		for(int i = 0; i<bytes.length; i++) {
			out.write(bytes[i]);
		}
		out.close();
		System.out.println("저장하였습니다.");
		/*
		int a;
		a = in.read();
		for(int i=0; i<bytes.length; i++) {
			System.out.println(Byte.toString((byte) in.read()));
		}
		*/
	}
	

}
