package step01;

public class recarMain {

	public static void main(String[] args) {
		reCar c = new reCar();
		c.cnt = 1;
		
		reCar c1 = new reCar();
		c1.cnt = 3;
		System.out.println("c.cnt: "+ c.cnt);			// 3 ���
		System.out.println("c1.cnt: "+ c1.cnt);			// 3 ���
		
		reCar.cnt = 10;									// ��ü �������� ����. Ŭ������ ����. �� Ŭ������ ����� static int cnt�� ������. 
		System.out.println("c.cnt: "+ c.cnt);			
		System.out.println("c1.cnt: "+ c1.cnt);
		
		
		c1.show();
		c1.print();
		reCar.show();	// this�� ��� ����
		//reCar.print();	// this������ �Ұ�
	}

}
