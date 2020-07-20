package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileOutputStream {

	public static void main(String[] args) throws IOException {
		FileOutputStream out = new FileOutputStream("fileOut.dat");
		byte[] bytes = {10,20,30,40,50,60,70,80,90,100};
		
		//out.write(bytes,0,10);	배열, 시작, 출력할 개수
		out.write(bytes);
		out.close();
		System.out.println("저장하였습니다");
	}

}
