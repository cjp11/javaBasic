package IO;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BoardMain {

	public static void main(String[] args) throws IOException {
		Board board = new Board("�����Դϴ�", "�����Դϴ�", "1111");
		board.no = 1;
		
		FileOutputStream out = new FileOutputStream("exam089_4.dat");
		BufferedOutputStream out2 = new BufferedOutputStream(out);
		DataOutputStream out3 = new DataOutputStream(out2);
		
		// ���� DataOutputStream�� ������� �ʴ´ٸ�,
		// ��ü�� ���� �����ϱ� ���� ��Ʈ �̵� �����ڸ� �ſ� ���� ����ؾ� �� ���̴�.
		// �׷���, DataOutputStream Ŭ������ ����ϸ�
		// ���ŷο� �ڵ��� ���� �� �ִ�.
		
		out3.writeInt(board.no);
		out3.writeUTF(board.title);
		out3.writeUTF(board.contents);
		out3.writeUTF(board.password);
		out3.writeUTF(board.createdDate);
		out3.writeInt(board.viewCount);
		
		// ���� ���� ���� �������� �ݴ´�.
		out3.close();
		out2.close();
		out.close();
		System.out.println("�����Ͽ����ϴ�.");
		
	}

}
