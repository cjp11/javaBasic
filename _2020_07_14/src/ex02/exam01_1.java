package ex02;
/*
 *  wrapper Ŭ����?
 *  - �ڹ� ���� ������ Ÿ���� ��ü�� �ٷ�� ���� ���� Ŭ����
 *  - byte, short, int, long, float, double, boolean, char
 *  byte -> java.lang.Byte
 *  short -> java.lang.Short
 *  int -> java.lang.Integer
 *  long -> ~.Long
 *  float -> ~.Float
 *  double -> ~.Double
 *  char -> ~.Character
 *  boolean -> ~.Boolean
 */
public class exam01_1 {

	public static void main(String[] args) {
		byte b = 10;
		Byte obj1 = new Byte(b);
		
		short s = 10;
		Short obj2 = new Short(s);
		
		int i = 10;
		Integer obj3 = new Integer(i);
		
		long l = 10L;
		Long obj4 = new Long(l);
		
		float f = 10f;
		Float obj5 = new Float(f);
		
		double d = 10; // default�� double�̹Ƿ� d�� ������ �ʴ´�.
		Double obj6 = new Double(d);
		
		char c = '��';
		Character obj7 = new Character(c);
		
		boolean bo = false;
		Boolean obj8 = new Boolean(bo);
	}

}
