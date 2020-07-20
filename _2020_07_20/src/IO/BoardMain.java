package IO;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BoardMain {

	public static void main(String[] args) throws IOException {
		Board board = new Board("제목입니다", "내용입니다", "1111");
		board.no = 1;
		
		FileOutputStream out = new FileOutputStream("exam089_4.dat");
		BufferedOutputStream out2 = new BufferedOutputStream(out);
		DataOutputStream out3 = new DataOutputStream(out2);
		
		// 만약 DataOutputStream을 사용하지 않는다면,
		// 객체의 값을 저장하기 위해 비트 이동 연산자를 매우 많이 사용해야 할 것이다.
		// 그런데, DataOutputStream 클래스를 사용하면
		// 번거로운 코딩을 줄일 수 있다.
		
		out3.writeInt(board.no);
		out3.writeUTF(board.title);
		out3.writeUTF(board.contents);
		out3.writeUTF(board.password);
		out3.writeUTF(board.createdDate);
		out3.writeInt(board.viewCount);
		
		// 닫을 때는 붙인 역순으로 닫는다.
		out3.close();
		out2.close();
		out.close();
		System.out.println("실행하였습니다.");
		
	}

}
