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

// data�� access �ϴ� Ŭ������ ����
public class BoardDao3 {
	ArrayList<Board> list = new ArrayList<Board>();
	
	// ���� �߻��ϸ� ������ �����ϱ�
	public BoardDao3() throws Exception{
		// 1) ������ ������ �����. ���� ���丮�� �����ϴ� ���丮. ��, ������Ʈ ����
		File file = new File("board.dat");
		FileInputStream in = null;
		ObjectInputStream in2 = null;
		try {
		in = new FileInputStream(file);
		in2 = new ObjectInputStream(in);
		Board board = null;
		while(true) {
			board = (Board)in2.readObject();
			list.add(board);
		} 
		}catch(Exception e) {
			System.out.println("������ �дٰ� ���� �߻�");
			throw e;
		}finally {
			// ���� �߻��� �����ϰ� ����
			try {
				in2.close();
			}catch(Exception e) {}
			try {
				in.close();
			}catch(Exception e) {}
		}
		
	}
	
	
	void insert(Board board) throws Exception{
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
		FileOutputStream out = null;
		ObjectOutputStream out2 = null;
		try {
		out = new FileOutputStream(file);
		out2 = new ObjectOutputStream(out);
			for(Board board: list) {
				out2.writeObject(board);
			}
		}catch(Exception e) {
			System.out.println("������ ����� ���� �߻�");
			throw e;	//���� ȣ���� �Լ��� throw
		}finally {
			try {out2.close();} catch(Exception e) {}
			try {out.close();} catch(Exception e) {}
		}
			
		
	}
}
