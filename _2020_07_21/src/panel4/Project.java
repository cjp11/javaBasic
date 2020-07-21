package panel4;

import java.io.Serializable;

public class Project implements Serializable{
	int no;
	String title;
	String contents;
	String writer;
	String createdDate;
	int viewCount;
	String password;
	
	public Project() {
		this.no = 1;
		this.title = "제목입니다";
		java.sql.Date today = new java.sql.Date(System.currentTimeMillis());
		String str = today.toString();
		this.createdDate = str;
		this.viewCount = 0;
		this.password = "1111";
	}
	
	public Project(String title, String contents, String password) {
		this();
		this.title = title;
		this.contents = contents;
		this.password = password;
	}
}