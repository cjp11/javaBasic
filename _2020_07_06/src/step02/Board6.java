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
		this("����","����","ȫ�浿");
		this.no = 1;
		
	}
	public Board6(String title, String contents, String writer) {	
		System.out.println("Board6(String, String, String) ������ ȣ���");
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		
	}
	public void printInfo() {
		System.out.println(no);  //�����ڿ��� �ʱ�ȭ��Ŵ.
		System.out.println(title); //�����ڿ��� �ʱ�ȭ��Ŵ.
		System.out.println(contents);
		System.out.println(writer);
		System.out.println(createDate); //�����ڿ��� �ʱ�ȭ��Ŵ.
		System.out.println(viewCount);  //�����ڿ��� �ʱ�ȭ��Ŵ.
		System.out.println(passwd);
	}	
}
