package IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Score2Main2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream in = new FileInputStream("exam089_8.dat");
		BufferedInputStream in2 = new BufferedInputStream(in);
		ObjectInputStream in3 = new ObjectInputStream(in2);
		
		
		
		Score2 s = (Score2)in3.readObject();	//�ϵ��ũ���� �о��
		in3.close();
		in2.close();
		in.close();
		System.out.println(s);
		/*
		 * ���: Score [name= ȫ�浿, kor= 100, eng= 50, math= 50, sum= 0, avg= 0.0]
		*/
		
	}

}
