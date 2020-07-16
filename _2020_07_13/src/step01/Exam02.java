package step01;

public class Exam02 {

	public static void main(String[] args) {
		A r1 = new A();
		A r2 = new A();
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
	
