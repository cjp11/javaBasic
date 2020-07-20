package IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Score2Main3 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream in = new FileInputStream("exam089_8.dat");
		BufferedInputStream in2 = new BufferedInputStream(in);
		ObjectInputStream in3 = new ObjectInputStream(in2);
		
		
		
		Score2 s = (Score2)in3.readObject();	//하드디스크에서 읽어옴
		s.compute();	// 이 처리를 해주면 조작해놓은 avg 값이 적용됨
		in3.close();
		in2.close();
		in.close();
		System.out.println(s);
		/*
		 * 출력: Score [name= 홍길동, kor= 100, eng= 50, math= 50, sum= 200, avg= 66.666664]
		*/
		
	}

}
