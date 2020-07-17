package ex03;

import java.io.File;
import java.io.IOException;

public class Exam07 {

	public static void main(String[] args) throws IOException {
		File f2 = new File(".");
		
		printJavaFile(f2);
	}
	
	static void printJavaFile(File dir) throws IOException {
		File[] list = dir.listFiles();
		for(File file : list) {
			if(file.isFile() && file.getName().endsWith(".java")) {
				System.out.println(file.getCanonicalPath());
			}else if(file.isDirectory()) {
				printJavaFile(file);
			}
		}
	}

}
