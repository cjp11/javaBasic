package ex09;

public class Member {
	String name;
	String email;
	String password;
	String signedUpdate;
	//int userNum = 0;
	static int cnt = 0;		// È¸¿ø¼ö
	
	public Member() {
		java.sql.Date today = new java.sql.Date(System.currentTimeMillis());
		String str = today.toString();
		this.signedUpdate = str;
		cnt++;
		//userNum = cnt;
	}
	
	public Member(String name, String email, String password) {
		this();
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
}
