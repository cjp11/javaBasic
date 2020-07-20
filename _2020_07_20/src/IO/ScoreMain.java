package IO;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ScoreMain {

	public static void main(String[] args) throws IOException {
		Score s = new Score();
		s.name = "홍길동";
		s.kor = 100;
		s.math = 50;
		s.eng = 50;
		s.compute();
		
		FileOutputStream out = new FileOutputStream("exam089_7.dat");
		BufferedOutputStream out2 = new BufferedOutputStream(out);
		ObjectOutputStream out3 = new ObjectOutputStream(out2);
		s.avg = 90.5f;
		out3.writeObject(s);
		
		out3.close();
		out2.close();
		out.close();
		System.out.println("실행하였습니다.");
	}

}
