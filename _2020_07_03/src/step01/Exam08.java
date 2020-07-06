package step01;

// 많이 쓰는 함수를 Array 클래스에 정의를 해 놓고 다른 클래스(Exam06) 에서 가져다 쓸 수 있음 (같은 패키지에 있으므로 사용 가능)
public class Exam08 {

	public static void main(String[] args) {
		
		Array2.arr= new int[20];
		Array2.initByIndexValue();
		Array2.mix();
		Array2.printAll(-1);
		Array2.sort();
		Array2.printAll(-1);
		System.out.println("------\t\t\t\t\t------");
		
		int[] backup = Array2.arr;		
		Array2.arr = new int[10];
		Array2.initByIndexValue();
		Array2.mix();
		Array2.printAll(-1);
		Array2.sort();
		Array2.printAll(-1);
		
		int[] backup1 = Array2.arr;
		Array2.arr = backup;
		Array2.mix();
		Array2.printAll(-1);
		Array2.sort();
		Array2.printAll(-1);
		
	}

}
