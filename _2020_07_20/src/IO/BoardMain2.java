package IO;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BoardMain2 {

	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("exam089_4.dat");
		BufferedInputStream in2 = new BufferedInputStream(in);
		DataInputStream in3 = new DataInputStream(in2);
		
		Board board = new Board();
		// ���� ���� �� ������� �״�� �о�� �Ѵ�.
		
		board.no = in3.readInt();
		board.title = in3.readUTF();
		board.contents = in3.readUTF();
		board.password = in3.readUTF();
		board.createdDate = in3.readUTF();
		board.viewCount = in3.readInt();
		
		
		// ���� �������� �ݴ´�.
		in3.close();
		in2.close();
		in.close();
		System.out.println("�����Ͽ����ϴ�.");
		System.out.println(board);
		
	}

}