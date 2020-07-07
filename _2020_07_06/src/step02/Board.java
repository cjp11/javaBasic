package step02;

public class Board {
	int no;
	String title;
	String contents;
	String writer;
	String createDate;
	int viewCount;
	String passwd;
	static int cnt = 0;
	
	//클래스에 생성자가 한 개도 없으면,
	//컴파일러는 다음과 같은 기본 생성자를 자동으로 추가한다.
	// public  Board(){}

	// 기본 생성자(특별한 메서드)를 선언한다.
	// 문법도 특별해서
	//1) 리턴 타입이 없고,
	//2) 메서드명은 클래스 이름과 같다.
	//3) 파라미터가 없다.
	//인스턴스 생성할 때 자동 호출된다.
	//만약 생성자를 만들지 않는다면, 컴파일러가 다음과 같이 기본 생성자를 만든다.
	// public Board(){ }
	
	public Board() {
		System.out.println("Board()");
		no = 1;
		title = "제목입니다.";
		contents = "내용입니다.";
		writer = "홍길동";
		createDate = "2020-07-06";
		viewCount = 0;
		passwd = "11111";
		cnt++;
	}
	public void test() {
		System.out.println("test()");
	}
	
}
