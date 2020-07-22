package exception;

import java.util.List;

public class ex06 {

	public static void main(String[] args) {
		try {
			BoardDao boardDao = new BoardDao();
			boardDao.insert(new Board("aaaa", "bbb", "1111"));
			boardDao.insert(new Board("aaaa", "bbb", "1111"));
			boardDao.insert(new Board("aaaa", "bbb", "1111"));

			boardDao.saveToFile();

			List<Board> list = boardDao.selectList();
			for (Board b : list) {
				System.out.println(b);
			}
		} catch (Exception e) {
			System.out.println("예외가 발생했습니다.\n더이상 할 일이 없다" + "\n그냥 멈추겠습니다");
		}
	}

}
