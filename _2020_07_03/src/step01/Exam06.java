package step01;

// ���� ���� �Լ��� Array Ŭ������ ���Ǹ� �� ���� �ٸ� Ŭ����(Exam06) ���� ������ �� �� ���� (���� ��Ű���� �����Ƿ� ��� ����)
public class Exam06 {

	public static void main(String[] args) {
		/*
		int[] arr = new int[20];
		Array.initByIndexValue(arr);
		Array.mix(arr);
		Array.printAll(arr,-1);
		Array.sort(arr);
		Array.printAll(arr,-1);
		System.out.println("------\t\t\t\t\t------");
		Array.mix(arr);
		Array.printAll(arr,-1);
		Array.sort(arr);
		Array.printAll(arr,-1);
		*/
		Car.cnt = 7; //����
		// Car.a = 8; �Ұ�, Ŭ���� �����̹Ƿ� (���� ��ü �������� ����) 
		
		Car c = new Car();
		//c.a = 8; // ����� �����ϱ� �����͸� ����� �� ����. 
		c.show();
		Car c1 = new Car();
		c1.show();
		
		Car.show();
		//Car.print();  ��ü ���� �������Ƿ� �Ϲ� Ŭ���� �Լ��� ����� �� ����. 
		
		
		c.show();
		c.print();
	}

}
