package exception;

public class ex03 {

	public static void main(String[] args) {
		try {
			work1();		
		}catch(Exception e ) {
			e.printStackTrace();
		}
		System.out.println("main end");
	}
	
	static void work1() throws Exception {
		try {
			throw new Exception("�ͼ��� �߻�");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
