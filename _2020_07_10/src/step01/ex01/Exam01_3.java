package step01.ex01;

public class Exam01_3 {

	// ������
	void print(Car car) {
		if(car instanceof Bus) {	//car�� Bus�� �ν��Ͻ���
			Bus b = (Bus)car;
			b.print();
		}
		if(car instanceof Texi) {
			Texi t = (Texi)car;
			t.print();
		}
	}
	/* �ʹ� ���� �Լ��� �ʿ�
	  static void print(Bus b) {
	    b.print();
	  }
	  
	*/
	

	
	public static void main(String[] args) {
		Motor r1 = new Car();
		
		r1.cc = 100;
		r1.maker = "��Ʈ�ڵ���";
		
		//r1.capacity = 200;	// ������ Ÿ�ӿ����� MotorŸ������ �ν��ϹǷ� ����.
							// Car���� ������ ���� ���
							// ����: �����Ϸ��� ���۷��� Ÿ�Կ� ����� �׸� ����� �� �ִ�.
							// 		���� �ش� �ν��Ͻ� ����(�� ��� capacity)�� �����Ѵ��ϴ���
							// 		���� �Ұ���!
		Car c = (Car)r1;
		c.capacity = 200;
		
		c.cc = 200;
		System.out.println("r1.cc: " + r1.cc);
		System.out.println("c.cc: " + c.cc);
		
		Bus b1 = new Bus();
		Texi t1 = new Texi();
		
		Exam01_3 obj = new Exam01_3();
		obj.print(b1);
		obj.print(t1);
		
		//print(b1);	-> static void print() �϶� ���
		//print(t1);
	
	}

}
