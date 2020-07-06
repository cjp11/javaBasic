package _0629practice;
import java.util.Scanner;
import java.util.Random;
public class practice2_12 {

	public static void main(String[] args) {
		System.out.println("정수 하나 입력: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		Random rd = new Random();
		int b = rd.nextInt(a+5 - (a-5) + 1) + a-5;	// nextInt(max-min+1) + min
		System.out.println(b);
		
		sc.close();
		

	}

}
