package step01;

// ���� ���� �Լ��� Array Ŭ������ ���Ǹ� �� ���� �ٸ� Ŭ����(Exam06) ���� ������ �� �� ���� (���� ��Ű���� �����Ƿ� ��� ����)
public class Exam07 {

	public static void main(String[] args) {
		
		Array2.arr= new int[20];		// arr�� static ó���ؼ� �Ű������� �����ϴ� ���� ������. 
		Array2.initByIndexValue();
		Array2.mix();
		Array2.printAll(-1);
		Array2.sort();
		Array2.printAll(-1);
		System.out.println("------\t\t\t\t\t------");
		Array2.mix();
		Array2.printAll(-1);
		Array2.sort();
		Array2.printAll(-1);
		
		
	}

}
