package IO;

import java.io.Serializable;
// 구조체를 한 번에 받는 것 처럼,Serializable인터페이스 사용해서 데이터를 한 덩이로 사용하고 싶을 때 
public class Board2 implements Serializable{
	int no;
	String title;
	String contents;
	String writer;
	String createdDate;
	int viewCount;
	String password;
	
	public Board2() {
		this.no = 1;
		this.title = "제목입니다.";
		java.sql.Date today = new java.sql.Date(System.currentTimeMillis());
		String str = today.toString();
		this.createdDate = str;
		this.password = "1111";
		
	}
	
	public Board2(String title, String contents, String password) {
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
