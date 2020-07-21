package panel3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

// data를 access 하는 클래스를 만듦
public class BoardDao {
	ArrayList<Board> list = new ArrayList<Board>();
	
	public BoardDao() {
		// 1) 파일이 없으면 만든다. 기존 디렉토리는 실행하는 디렉토리. 즉, 프로젝트 폴더
		File file = new File("board.dat");
		if(!(file.exists()) && file.isFile()) {
			return;
		}
		try (
			// board.dat 파일을 바이트 단위로 읽는 도구
			FileInputStream in = new FileInputStream(file);
			// 바이트 데이터를 객체로 만들어 리턴하는 도구를 사용
			ObjectInputStream in2 = new ObjectInputStream(in);)
		{
		// 2) 파일이 있으면 해당 파일에서 데이터를 읽어 ArrayList에 저장한다. 
			Board board = null;
			while(true) {
				board = (Board)in2.readObject();
				list.add(board);
			}
		}
		catch(Exception e) {
			// 파일을 읽다가 오류가 발생한다.
			// -> 적절히 오류를 처리한 다음 계속 실행한다.
			// -> 이것이 예외 처리 문법이 존재하는 이유
		}
	}
	
	
	void insert(Board board) {
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
	int update(Board board) {
		if(board.no > 0 && board.no < list.size()) {
			list.set(board.no, board);
			saveToFile();
			return 1;
		}
		return 0;
	}
	
	int delete(int no) {
		if( no >=0 && no < list.size()) {
			list.remove(no);
			saveToFile();
			return 1;
		}
		return 0;
	}
	
	void saveToFile() {
		File file = new File("board.dat");
		try(FileOutputStream out = new FileOutputStream(file);
				ObjectOutputStream out2 = new ObjectOutputStream(out);
				){
			for(Board board: list) {
				out2.writeObject(board);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
