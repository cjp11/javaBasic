package step02;

public class Board6 {
	int no;
	String title;
	String contents;
	String writer;
	String createDate;
	int viewCount;
	String passwd;
	
	public Board6() {
		this("제목","내용","홍길동");
		this.no = 1;
		
	}
	public Board6(String title, String contents, String writer) {	
		System.out.println("Board6(String, String, String) 생성자 호출됨");
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		
	}
	public void printInfo() {
		System.out.println(no);  //생성자에서 초기화시킴.
		System.out.println(title); //생성자에서 초기화시킴.
		System.out.println(contents);
		System.out.println(writer);
		System.out.println(createDate); //생성자에서 초기화시킴.
		System.out.println(viewCount);  //생성자에서 초기화시킴.
		System.out.println(passwd);
	}	
}
