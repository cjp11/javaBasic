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
		System.out.println("Board5() ������ ȣ���");
		this.no = 1;
		java.sql.Date today = new java.sql.Date(System.currentTimeMillis());
		String str = today.toString();
		this.createDate =str;
		this.viewCount = 0;
		this.passwd = "11111";
		
		this.title = "�����Դϴ�.";
	}
	public Board5(String title, String contents, String writer) {
		//�ٸ� �����ڸ� ȣ���Ҷ�
		//=> this(�Ķ����, ...);
		//=> �ݵ�� ù ��° �������� �;� �Ѵ�.
		
		this();// �⺻ �����ڸ� ȣ���Ͽ� �⺻ �۾��� �����Ѵ�.
		
		
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		
	}
	public Board5(int no, String title) {
		//�ٸ� �����ڸ� ȣ���Ҷ�
		//=> this(�Ķ����, ...);
		//=> �ݵ�� ù ��° �������� �;� �Ѵ�.
		
		this();// �⺻ �����ڸ� ȣ���Ͽ� �⺻ �۾��� �����Ѵ�.
		
		
		this.no = no;
		this.title = title;
	}
	//"�ν��Ͻ� �޼���"�� �θ���. => �ν��Ͻ� ���� ����Ͽ� �۾��� �����ϴ� �޼���.
	//"������"�� �θ���. => Board4 Ÿ���� �����͸� �ٷ� �� �ִ� �����ڷμ� ����
	//"�޽���"�� �θ���. => Board4 ��ü�� �����ϴ� �޽���(��ɾ�).
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
