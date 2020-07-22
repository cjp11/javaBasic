package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

// data를 access 하는 클래스를 만듦
public class BoardDao {
	ArrayList<Board> list = new ArrayList<Board>();
	
	// 예외 발생하면 무조건 보고하기
	public BoardDao() throws IOException, ClassNotFoundException {
		// 1) 파일이 없으면 만든다. 기존 디렉토리는 실행하는 디렉토리. 즉, 프로젝트 폴더
		File file = new File("board.dat");
		
		FileInputStream in = new FileInputStream(file);
		ObjectInputStream in2 = new ObjectInputStream(in);
		Board board = null;
		while(true) {
			board = (Board)in2.readObject();
			list.add(board);
		}
	}
	
	
	void insert(Board board) throws Exception {
		list.add(board);
		saveToFile();
	}
	
	List<Board> selectList() {
		return list;
	}
	
	Board selectOne(int no) {
		if( no >=0 && no < list.size()) {
			return list.get(no);
		}
		return null;
	}
	int update(Board board) throws Exception{
		if(board.no > 0 && board.no < list.size()) {
			list.set(board.no, board);
			saveToFile();
			return 1;
		}
		return 0;
	}
	
	int delete(int no) throws Exception{
		if( no >=0 && no < list.size()) {
			list.remove(no);
			saveToFile();
			return 1;
		}
		return 0;
	}
	
	void saveToFile() throws Exception{
		File file = new File("board.dat");
		FileOutputStream out = new FileOutputStream(file);
		ObjectOutputStream out2 = new ObjectOutputStream(out);
		for(Board board: list) {
			out2.writeObject(board);
		}
			
		
	}
}
