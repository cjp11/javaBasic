package ex03;

import java.io.File;

public class Exam03 {

	public static void main(String[] args) {
		File f2 = new File(".");
		
		String[] list = f2.list();
		for(String item : list) {
			System.out.println(item);
		}
	}

}
