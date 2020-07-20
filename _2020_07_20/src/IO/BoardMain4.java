package IO;
 // Serializable 인터페이스를 사용해서 한 덩이(board2)로 만들어줘서 데이터 하나씩 순서대로(BoardMain3처럼) 처리하지 않아도 됨
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class BoardMain4 {

	public static void main(String[] args) throws IOException {
		//Board board = new Board("제목입니다", "내용입니다", "1111");
		//board.no = 1;
		
		Board2 board2 = new Board2("제목입니다", "내용입니다", "1111");
		board2.no = 1;
		
		FileOutputStream out = new FileOutputStream("exam089_6.dat");
		BufferedOutputStream out2 = new BufferedOutputStream(out);		// Decorator (FileoutputStream 위에 쌓는다는 느낌)
		ObjectOutputStream out3 = new ObjectOutputStream(out2);			// Decorator
		
		out3.writeObject(board2);	

		
		out3.close();
		out2.close();
		out.close();
		System.out.println("실행하였습니다.");
	}

}
