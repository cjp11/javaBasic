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
	
	//Ŭ������ �����ڰ� �� ���� ������,
	//�����Ϸ��� ������ ���� �⺻ �����ڸ� �ڵ����� �߰��Ѵ�.
	// public  Board(){}

	// �⺻ ������(Ư���� �޼���)�� �����Ѵ�.
	// ������ Ư���ؼ�
	//1) ���� Ÿ���� ����,
	//2) �޼������ Ŭ���� �̸��� ����.
	//3) �Ķ���Ͱ� ����.
	//�ν��Ͻ� ������ �� �ڵ� ȣ��ȴ�.
	//���� �����ڸ� ������ �ʴ´ٸ�, �����Ϸ��� ������ ���� �⺻ �����ڸ� �����.
	// public Board(){ }
	
	public Board() {
		System.out.println("Board()");
		no = 1;
		title = "�����Դϴ�.";
		contents = "�����Դϴ�.";
		writer = "ȫ�浿";
		createDate = "2020-07-06";
		viewCount = 0;
		passwd = "11111";
		cnt++;
	}
	public void test() {
		System.out.println("test()");
	}
	
}
