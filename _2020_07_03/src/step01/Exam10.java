package step01;

// 많이 쓰는 함수를 Array 클래스에 정의를 해 놓고 다른 클래스(Exam06) 에서 가져다 쓸 수 있음 (같은 패키지에 있으므로 사용 가능)
public class Exam10 {

	public static void main(String[] args) {
		// **** Exam08 처럼 backup 만들어서 처리할 것 없이 각각 따로 만들어줌. ****
		Array4 instance1 = new Array4();
		instance1.arr = new int[20];
		
		Array4 instance2 = new Array4();
		instance2.arr = new int[10];
		
		instance1.initByIndexValue();	// 객체의 주소가 숨어서 전달됨. 즉 instance1의 주소값이 전달됨. 내부에 this.arr.length 로 쓸 수있음. 
		instance1.mix();
		instance1.printAll(-1);
		instance1.sort();
		instance1.printAll(-1);
		System.out.println("------\t\t\t\t\t------");
		
			
		
		instance2.initByIndexValue();
		instance2.mix();
		instance2.printAll(-1);
		instance2.sort();
		instance2.printAll(-1);
		
		
		
		instance1.mix();
		instance1.printAll(-1);
		instance1.sort();
		instance1.printAll(-1);
		
	}

}
