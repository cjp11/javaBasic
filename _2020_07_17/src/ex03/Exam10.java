package ex03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exam10 {

	public static void main(String[] args) throws IOException {
		File f = new File("Exam09_1.dat");
		FileInputStream in = new FileInputStream(f);
		
		int b;
		b = in.read();
		System.out.println(Integer.toHexString(b));
		System.out.println(Integer.toHexString(in.read()));
		System.out.println(Integer.toHexString(in.read()));
		in.close();
		System.out.println("읽었습니다.");
		
		
	}

}
