package _0629practice;
import java.util.Random;

public class practice2_13 {

	public static void main(String[] args) {
		Random rd = new Random();
		double a = rd.nextDouble();
		System.out.println(a);
		System.out.println(a*10);
		
	
		// 0~1 범위에 곱하기 2하면 0~2범위가 됨
		// 0~2 범위 -1처리하면 -1~1 범위가 됨. 
		double b = 2*(rd.nextDouble()) - 1;
		System.out.println(b);
		// -20.0 ~ 20.0
		double c = 10*(rd.nextDouble()) - 20;
		System.out.println(c);
	}
	

}
