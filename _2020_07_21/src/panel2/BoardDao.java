package panel2;

import java.util.List;
import java.util.ArrayList;

// data를 access 하는 클래스를 만듦
public class BoardDao {
	ArrayList<Board> list = new ArrayList<Board>();
	
	void insert(Board board) {
		list.add(board);
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
			return 1;
		}
		return 0;
	}
	
	int delete(int no) {
		if( no >=0 && no < list.size()) {
			list.remove(no);
			return 1;
		}
		return 0;
	}
}
