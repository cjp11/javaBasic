package IO;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class BoardMain3 {

	public static void main(String[] args) throws IOException {
		Board board = new Board("제목입니다", "내용입니다", "1111");
		board.no = 1;
		
		//Board2 board2 = new Board2("제목입니다", "내용입니다", "1111");
		//board2.no = 1;
		
		FileOutputStream out = new FileOutputStream("exam089_5.dat");
		BufferedOutputStream out2 = new BufferedOutputStream(out);
		ObjectOutputStream out3 = new ObjectOutputStream(out2);
		
		out3.writeObject(board);	// Exception in thread "main" java.io.NotSerializableException: IO.Board
									//	at java.io.ObjectOutputStream.writeObject0(Unknown Source)
									//	at java.io.ObjectOutputStream.writeObject(Unknown Source)
									//  at IO.BoardMain3.main(BoardMain3.java:22)

		
		out3.close();
		out2.close();
		out.close();
		System.out.println("실행하였습니다.");
	}

}
