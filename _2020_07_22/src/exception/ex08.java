package exception;

import java.util.List;

public class ex08 {

	public static void main(String[] args) {
		try {
			BoardDao3 boardDao = null;
			try {
				boardDao = new BoardDao3();			// ������ ȣ��� �� �����ڰ� ����� ��������� �ʾҴٸ�
			}catch(Exception e) {}
			
			try {
				boardDao.insert(new Board("aaaa","bbb","1111"));	// ���⼭ boardDao�� null ���̵�. �����߻�. (���: ����ó���� �������� ����)
				boardDao.insert(new Board("aaaa","bbb","1111"));
				boardDao.insert(new Board("aaaa","bbb","1111"));
			}catch(Exception e) {
				System.out.println("�Է� ���� �߻�!");
			}
			boardDao.saveToFile();						// saveToFile���� ó���� ���ܸ� 26line���� ���� �� �����Ƿ� catch�� ����ߵ�
			List<Board>list = boardDao.selectList();
			for(Board b: list) {
				System.out.println(b);
			}
		}catch(Exception e) {
			System.out.println("���ܰ� �߻� �߽��ϴ�.");
		}
	}

}