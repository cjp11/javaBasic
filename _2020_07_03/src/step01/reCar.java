package step01;

public class reCar {
	static int cnt = 0;		// int cnt / static int  ���ϱ� 
	public static int a = 0;
	public static int b = 0;
	
	reCar() {
		System.out.println("reCar()");
	}
	
	static public void show() {					//  static int a,b �� �������� �ʾ����Ƿ� 
												// ��ü�� �������� �ʾҴٸ� print(~~a,~~b)�ȿ� �ִ� a,b�� �νĵ��� �ʴ´�.
												// static public int a,b�� �����ϸ� a,b�� �ν��� �� �ִ�. ��ü �������� �ʾƵ� �ǹǷ�
		System.out.println("a: " + a + "b: "+ b);
	}
	public void print() {		
		System.out.println("a: " + a + "b: "+ b);	
	}
	
}
