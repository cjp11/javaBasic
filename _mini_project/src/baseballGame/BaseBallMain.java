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
			System.out.println(result[0]+"��Ʈ����ũ " + result[1]+ "��");
			if(result[0] == 3) {
				System.out.println("�����ƿ�!");
				System.out.println("�ٽ��Ͻðڽ��ϱ�?(y/n)");
				String str = sc.nextLine();
			
				if(str.equals("y")) {
					a = GeneratorThreeNum.makeThreeNum();	// ���� ���ڰ� �ٲٱ�.
					continue;
				}
				else break;
			}
		}
		sc.close();
	}

}