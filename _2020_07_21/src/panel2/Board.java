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
		this.title = "제목입니다";
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
 * 역할: 게시물 데이터를 보관
 * 데이터를 보관하는 역할자를 "값 객체(VO)"라 부른다.
 * -> "(비즈니스) 도메인 객체(DO)"
 * -> "데이터 전송용 객체(DTO)" 라고도 부름.
 */
