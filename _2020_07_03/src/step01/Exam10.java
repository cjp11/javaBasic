package step01;

// ���� ���� �Լ��� Array Ŭ������ ���Ǹ� �� ���� �ٸ� Ŭ����(Exam06) ���� ������ �� �� ���� (���� ��Ű���� �����Ƿ� ��� ����)
public class Exam10 {

	public static void main(String[] args) {
		// **** Exam08 ó�� backup ���� ó���� �� ���� ���� ���� �������. ****
		Array4 instance1 = new Array4();
		instance1.arr = new int[20];
		
		Array4 instance2 = new Array4();
		instance2.arr = new int[10];
		
		instance1.initByIndexValue();	// ��ü�� �ּҰ� ��� ���޵�. �� instance1�� �ּҰ��� ���޵�. ���ο� this.arr.length �� �� ������. 
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
