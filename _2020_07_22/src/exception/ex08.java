package exception;

import java.util.List;

public class ex08 {

	public static void main(String[] args) {
		try {
			BoardDao3 boardDao = null;
			try {
				boardDao = new BoardDao3();			// 생성자 호출될 때 생성자가 제대로 만들어지지 않았다면
			}catch(Exception e) {}
			
			try {
				boardDao.insert(new Board("aaaa","bbb","1111"));	// 여기서 boardDao는 null 값이됨. 문제발생. (결론: 예외처리는 단위별로 하자)
				boardDao.insert(new Board("aaaa","bbb","1111"));
				boardDao.insert(new Board("aaaa","bbb","1111"));
			}catch(Exception e) {
				System.out.println("입력 오류 발생!");
			}
			boardDao.saveToFile();						// saveToFile내에 처리된 예외를 26line으로 던질 수 있으므로 catch를 써줘야됨
			List<Board>list = boardDao.selectList();
			for(Board b: list) {
				System.out.println(b);
			}
		}catch(Exception e) {
			System.out.println("예외가 발생 했습니다.");
		}
	}

}
