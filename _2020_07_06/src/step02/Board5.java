package step02;

public class Board5 {
	int no;
	String title;
	String contents;
	String writer;
	String createDate;
	int viewCount;
	String passwd;
	public Board5() {
		System.out.println("Board5() 생성자 호출됨");
		this.no = 1;
		java.sql.Date today = new java.sql.Date(System.currentTimeMillis());
		String str = today.toString();
		this.createDate =str;
		this.viewCount = 0;
		this.passwd = "11111";
		
		this.title = "제목입니다.";
	}
	public Board5(String title, String contents, String writer) {
		//다른 생성자를 호출할때
		//=> this(파라미터, ...);
		//=> 반드시 첫 번째 문장으로 와야 한다.
		
		this();// 기본 생성자를 호출하여 기본 작업을 수행한다.
		
		
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		
	}
	public Board5(int no, String title) {
		//다른 생성자를 호출할때
		//=> this(파라미터, ...);
		//=> 반드시 첫 번째 문장으로 와야 한다.
		
		this();// 기본 생성자를 호출하여 기본 작업을 수행한다.
		
		
		this.no = no;
		this.title = title;
	}
	//"인스턴스 메서드"라 부른다. => 인스턴스 값을 사용하여 작업을 수행하는 메서드.
	//"연산자"라 부른다. => Board4 타입의 데이터를 다룰 수 있는 연산자로서 역할
	//"메시지"라 부른다. => Board4 객체에 전달하는 메시지(명령어).
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
