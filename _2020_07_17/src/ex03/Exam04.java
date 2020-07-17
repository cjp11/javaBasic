package ex03;

import java.io.File;

public class Exam04 {

	public static void main(String[] args) {
		File f2 = new File(".");
		
		File[] list = f2.listFiles();
		
		for(File item : list) {
			System.out.printf("%s %s\n", item.isDirectory() ? "d":"-", item.getName());
		}
	}

}
