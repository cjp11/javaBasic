package IO;
// ScoreMain���� ������ �����͸� �д� �ڵ�
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ScoreMain2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream in = new FileInputStream("exam089_7.dat");
		BufferedInputStream in2 = new BufferedInputStream(in);
		ObjectInputStream in3 = new ObjectInputStream(in2);
		
		/*
		 * ���: Score [name= ȫ�浿, kor= 100, eng= 50, math= 50, sum= 200, avg= 90.5]

		 * ��� ����� ���� ��� ���� ���۵� ���̴�.
		 * ����� ��ü�� ���� ���� ��, ���۵� ���� ���� ���ɼ��� �ּ�ȭ��Ű�� ���� �ʿ�
		 * -> ���� �ν��Ͻ��� ���� ���� ������ ����ؼ� ������ ���� ����ȭ ��󿡼� �����ϴ� ���� ����. 
		 * -> �д� �ʿ��� �ٽ� ����ϴ� ���� ������ �ŷڼ��� ���̴� ����̴�. 
		 * 
		 */
		
		Score s = (Score)in3.readObject();
		in3.close();
		in2.close();
		in.close();
		System.out.println(s);
		
		
	}

}
