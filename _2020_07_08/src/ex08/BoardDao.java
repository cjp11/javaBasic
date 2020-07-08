package ex08;
// BoardController에서 data를 다루는 부분만 따로 빼서 정의한 클래스 
public class BoardDao {		// data access object 
	Board[] boards = new Board[10];
	int length = 0;
	
	void insert(Board board) {
		boards[length++] = board;
	}
	
	Board[] selectList() {
		Board[] dataArray = new Board[length];
		for(int i=0; i<length; i++) {
			dataArray[i] = boards[i];
		}
		return dataArray;
	}
	
	Board selectOne(int no) {
		if( no >= 0 && no < length) {
			return boards[no];
		}
		return null;
	}
	
	void update(Board board) {
		boards[board.no] = board;
	}
	
	int delete(int no) {
		if(no >= 0 && no <length) {
			for(int i=no; i<length; i++) {
				boards[i] = boards[i+1];
			}
			this.length--;
			return 1;
		}
		return 0;
	}
	int size() {
		return length;
	}
}
