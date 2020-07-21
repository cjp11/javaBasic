package panel4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

// data�� access �ϴ� Ŭ������ ����
public class BoardDao {
	ArrayList<Board> list = new ArrayList<Board>();
	
	public BoardDao() {
		// 1) ������ ������ �����. ���� ���丮�� �����ϴ� ���丮. ��, ������Ʈ ����
		File file = new File("board.dat");
		if(!(file.exists()) && file.isFile()) {
			return;
		}
		try (
			// board.dat ������ ����Ʈ ������ �д� ����
			FileInputStream in = new FileInputStream(file);
			// ����Ʈ �����͸� ��ü�� ����� �����ϴ� ������ ���
			ObjectInputStream in2 = new ObjectInputStream(in);)
		{
		// 2) ������ ������ �ش� ���Ͽ��� �����͸� �о� ArrayList�� �����Ѵ�. 
			Board board = null;
			while(true) {
				board = (Board)in2.readObject();
				list.add(board);
			}
		}
		catch(Exception e) {
			// ������ �дٰ� ������ �߻��Ѵ�.
			// -> ������ ������ ó���� ���� ��� �����Ѵ�.
			// -> �̰��� ���� ó�� ������ �����ϴ� ����
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