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
			throw new Exception("ÀÍ¼Á¼Ç ¹ß»ý");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
