package exception;

public class ex04 {

	public static void main(String[] args) {
		try {
			work2();		// ���� ���� �ʿ��� ó���Ѵ�
		}catch(Exception e) {		
			e.printStackTrace();
		}
		
	}
	
	// ���������� ó���ؼ��� �ȵǴ� ���
	// �ݵ�� ȣ���ڿ��� ���� ��Ȳ�� �����ϴ� ���� ����.
	static void work2() throws Exception {
		work3();
	}
	
	
	static void work3() throws Exception {
		throw new Exception("�ͼ��� �߻�");
	}


}