package panel2;

public class Board {
	int no;
	String title;
	String contents;
	String writer;
	String createdDate;
	int viewCount;
	String password;
	
	public Board() {
		this.no = 1;
		this.title = "�����Դϴ�";
		java.sql.Date today = new java.sql.Date(System.currentTimeMillis());
		String str = today.toString();
		this.createdDate = str;
		this.viewCount = 0;
		this.password = "1111";
	}
	
	public Board(String title, String contents, String password) {
		this();
		this.title = title;
		this.contents = contents;
		this.password = password;
	}
}
/*
 * ����: �Խù� �����͸� ����
 * �����͸� �����ϴ� �����ڸ� "�� ��ü(VO)"�� �θ���.
 * -> "(����Ͻ�) ������ ��ü(DO)"
 * -> "������ ���ۿ� ��ü(DTO)" ��� �θ�.
 */
