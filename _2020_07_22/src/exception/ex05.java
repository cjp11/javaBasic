package exception;

public class ex05 {

	public static void main(String[] args) {
		try {
			work3();	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// ���������� ó���ؼ��� �ȵǴ� ���
	// �׷��� �����ϱ� ���� �ӽ� ó���ؾ� �ϴ� ���,
	// try ~ catch�� ����Ͽ� ���������� ó���� ��
	// ȣ���ڿ��� �����ϴ� ����� ���Ѵ�. 
	static void work3() throws Exception {
		try {
			throw new Exception("�ͼ��� �߻�");		// ������ ���� �߻���Ŵ
		}catch (Exception e) {
		//	String message = e.getMessage();
		//	System.out.println(message);
			System.out.println("�ͼ��� �߰� ó��");
			throw e;
		}
	}

}
