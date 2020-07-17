package ex01;

interface Cal{
	int add(int a, int b);	
	//int sub(int a, int b);
}

class CalImp implements Cal {

	int result;
	@Override
	public int add(int a, int b) {
		
		return result = a+b;
	}
	/*
	@Override
	public int sub(int a, int b) {
		return result = a-b;
	}*/
	
	public String toString() {
	       return "result: " + result;
	   }
	   
}

public class Test03 {

	public static void main(String[] args) {
		
		Cal cal = ((int a, int b) -> {return a*b;});	// 인터페이스에 함수 하나만 가능.
		 												// 인터페이스 내에 sub함수는 불가능. 오버로딩도 불가능 
		
		CalImp a = new CalImp();
		a.add(10,20);
		System.out.println(a);
		//a.sub(10,20);
		//System.out.println(a);
		
	}

}
