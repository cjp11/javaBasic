package step01;

// 많이 쓰는 함수를 Array 클래스에 정의를 해 놓고 다른 클래스(Exam06) 에서 가져다 쓸 수 있음 (같은 패키지에 있으므로 사용 가능)
public class Exam09 {

	public static void main(String[] args) {
		// **** Exam08 처럼 backup 만들어서 처리할 것 없이 각각 따로 만들어줌. ****
		Array3 instance1 = new Array3();
		instance1.arr = new int[20];
		
		Array3 instance2 = new Array3();
		instance2.arr = new int[10];
		
		Array3.initByIndexValue(instance1);
		Array3.mix(instance1);
		Array3.printAll(instance1,-1);
		Array3.sort(instance1);
		Array3.printAll(instance1,-1);
		System.out.println("------\t\t\t\t\t------");
		
			
		
		Array3.initByIndexValue(instance2);
		Array3.mix(instance2);
		Array3.printAll(instance2,-1);
		Array3.sort(instance2);
		Array3.printAll(instance2,-1);
		
		
		
		Array3.mix(instance1);
		Array3.printAll(instance1,-1);
		Array3.sort(instance1);
		Array3.printAll(instance1,-1);
		
	}

}
