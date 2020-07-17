package ex03;

import java.io.File;
import java.io.FilenameFilter;

public class Exam06 {

	public static void main(String[] args) {
		File f2 = new File(".");
		
		File[] list = f2.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				if(name.endsWith(".java"))
					return true;
				return false;
			}
		});
		
		for(File item:list) {
			System.out.printf("%s %s\n", item.isDirectory()? "d":"-", item.getName());
		}
	}

}
