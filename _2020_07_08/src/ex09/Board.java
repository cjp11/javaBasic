package ex09;

public class Board {
	static int cnt = 0;
	int no;
	String title;
	String content;
	String password;
	String createDate;
	int viewCount;
	
	public Board() {
		this.no = ++cnt;
		java.sql.Date today = new java.sql.Date(System.currentTimeMillis());
		String str = today.toString();
		this.createDate = str;
		this.viewCount = 0;
	}
	
	public void printInfo() {
		System.out.print(no + "	");
		System.out.print(title + "	");
		System.out.print(content + "	");
		System.out.print(password + "	");
		System.out.print(createDate + "	");
		System.out.println(viewCount);
		
	}
}
