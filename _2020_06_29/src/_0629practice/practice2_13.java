package _0629practice;
import java.util.Random;

public class practice2_13 {

	public static void main(String[] args) {
		Random rd = new Random();
		double a = rd.nextDouble();
		System.out.println(a);
		System.out.println(a*10);
		
	
		// 0~1 ������ ���ϱ� 2�ϸ� 0~2������ ��
		// 0~2 ���� -1ó���ϸ� -1~1 ������ ��. 
		double b = 2*(rd.nextDouble()) - 1;
		System.out.println(b);
		// -20.0 ~ 20.0
		double c = 10*(rd.nextDouble()) - 20;
		System.out.println(c);
	}
	

}
