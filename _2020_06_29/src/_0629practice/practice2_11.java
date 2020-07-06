
package _0629practice;
import java.util.Random;
public class practice2_11 {

	public static void main(String[] args) {
		Random rd = new Random();
		int a = rd.nextInt(9);
		System.out.println(a);
		int b = -1 - rd.nextInt(9); // (-1)*(a+1);
		System.out.println(b);
		int c = rd.nextInt(90) + 10;
		System.out.println(c);
		

	}

}
