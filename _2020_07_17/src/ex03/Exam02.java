package ex03;

import java.io.File;
import java.io.IOException;

public class Exam02 {

	public static void main(String[] args) throws IOException {
		File f = new File("");
		
		System.out.println(f.exists());
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		System.out.println(f.getCanonicalPath());
		System.out.println(f.getAbsolutePath());
		System.out.println();
		
		File f2 = new File("..");	// .(현재 디렉토리), ..(상위 디렉토리)
		System.out.println(f2.exists());
		System.out.println(f2.isDirectory());
		System.out.println(f2.isFile());
		System.out.println(f2.getCanonicalPath());
		System.out.println(f2.getAbsolutePath());
	}

}
