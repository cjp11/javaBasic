package ex02;
/*
 *  wrapper 클래스?
 *  - 자바 원시 데이터 타입을 객체로 다루기 위해 만든 클래스
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
		
		double d = 10; // default가 double이므로 d를 붙이지 않는다.
		Double obj6 = new Double(d);
		
		char c = '가';
		Character obj7 = new Character(c);
		
		boolean bo = false;
		Boolean obj8 = new Boolean(bo);
	}

}
