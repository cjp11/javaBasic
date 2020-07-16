package step01;
// 목적: Object 클래스에 있는 함수들을 오버라이딩(재정의) 해서 사용할 수 있다. 
public class Exam03 {

	public static void main(String[] args) {
		A2 r1 = new A2();
		A2 r2 = new A2();
		System.out.printf("r1.toString(): %s\n", r1.toString());
		System.out.printf("r1.hashCode(): %s\n", Integer.toHexString(r1.hashCode()));
		System.out.printf("r2.toString(): %s\n", r2.toString());
		System.out.printf("r2.hashCode(): %s\n", Integer.toHexString(r2.hashCode()));
	
	
		if(r1 == r2) {
			System.out.println("r1 == r2");
		}
	
		if(r1.equals(r2)) {
			System.out.println("r1.equals(r2)");
		}
		
	}


}
	
