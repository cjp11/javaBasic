package baseballGame;

import java.util.Scanner;

public class BaseBallMain {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		BaseBallMenu.sc = sc;
		GeneratorThreeNum.sc = sc;
		int[] a;
		int[] b;
		int result[];
	
		a = GeneratorThreeNum.makeThreeNum();
		while(true) {
			//a = GeneratorThreeNum.makeThreeNum();
			for(int i=0; i<3; i++) {
				System.out.print(a[i]);
			}
			System.out.println();
			
			
			b = BaseBallMenu.print();
			result = DecisionBall.decide(a,b);
			System.out.println(result[0]+"스트라이크 " + result[1]+ "볼");
			if(result[0] == 3) {
				System.out.println("삼진아웃!");
				System.out.println("다시하시겠습니까?(y/n)");
				String str = sc.nextLine();
			
				if(str.equals("y")) {
					a = GeneratorThreeNum.makeThreeNum();	// 랜덤 숫자값 바꾸기.
					continue;
				}
				else break;
			}
		}
		sc.close();
	}

}