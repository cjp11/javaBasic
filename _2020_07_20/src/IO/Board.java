package IO;

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
		this.title = "제목입니다.";
		java.sql.Date today = new java.sql.Date(System.currentTimeMillis());
		String str = today.toString();
		this.createdDate = str;
		this.password = "1111";
		
	}
	
	public Board(String title, String contents, String password) {
		this();
		this.title = title;
		this.contents = contents;
		this.password = password;
		
	}
	
	@Override
	public String toString() {
		return "Board [no="+ no + " ,title" + title + ", contents" + contents +
				", writer=" + writer + ", createdDate=" + createdDate + 
				", viewCount="+ viewCount + ", password=" + password + "]";
	}
}
/*
 *	데이터 보관하는 역할자를 "값 객체(VO: Value Object)" 라 부른다.
 * -> 다른 말로 "(비즈니스) 도메인 객체(domain objct)" 라 부른다.
 * -> 또 다른 말로는 "데이터 전송용으로 사용하는 객체(DTO: Data Transfer Object)" 라 부른다.
 * -> 용어 정리 : VO == DTO == 도메인 객체
 *
 */
