package ex03;

import java.util.Scanner;

public class exam01_1 {

	public static void main(String[] args) {
		Scanner keyScan = new Scanner(System.in);
		String[] names = new String[5];
		
		int i = 0;
		String name;
		while(true) {
			if(i >= names.length) {
				System.out.println("이름을 저장할 공간이 부족합니다.");
				break;
			}
			name = keyScan.nextLine();
			if(name.contentEquals("")) break;	// 값이 있는가?
			names[i] = name;
			i++;
		}
		System.out.println("-------------");
		for(int x = 0; x < i; x++) {
			System.out.println(names[x]);
		}
		keyScan.close();
	}

}
