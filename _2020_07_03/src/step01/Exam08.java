package step01;

// ���� ���� �Լ��� Array Ŭ������ ���Ǹ� �� ���� �ٸ� Ŭ����(Exam06) ���� ������ �� �� ���� (���� ��Ű���� �����Ƿ� ��� ����)
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
