package IO;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Score2Main {

	public static void main(String[] args) throws IOException {
		Score2 s = new Score2();
		s.name = "홍길동";
		s.kor = 100;
		s.math = 50;
		s.eng = 50;
		s.compute();
		
		FileOutputStream out = new FileOutputStream("exam089_8.dat");
		BufferedOutputStream out2 = new BufferedOutputStream(out);
		ObjectOutputStream out3 = new ObjectOutputStream(out2);
		s.avg = 90.5f;			// 조작가능한 값. (이미 위에서 compute() 되어서 avg값이 만들어져 있는 상태)
		out3.writeObject(s);
		
		out3.close();
		out2.close();
		out.close();
		System.out.println("실행하였습니다.");
	}

}
