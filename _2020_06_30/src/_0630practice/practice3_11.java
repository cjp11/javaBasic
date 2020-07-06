package _0630practice;

public class practice3_11 {

	public static void main(String[] args) {
		double a = 1234.2131;
		double b = -12321.432;
		
		double res = a > b ? a : (a < b ? b : a);
		
		System.out.println(res);
	}

}
