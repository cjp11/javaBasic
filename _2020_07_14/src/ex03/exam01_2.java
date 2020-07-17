package ex03;

import java.util.Scanner;
// 배열의 크기를 조정하기. 
public class exam01_2 {

	public static void main(String[] args) {
		Scanner keyScan = new Scanner(System.in);
		String[] names = new String[5];
		
		int i = 0;
		String name;
		while(true) {
			if(i >= names.length) {
				System.out.println("이름을 저장할 공간이 부족합니다.");
				String[] temp = new String[names.length+2];
				for(int j=0; j<names.length; j++) {
					temp[j] = names[j];
				}
				names = temp;
				//break;
			}
			name = keyScan.nextLine();
			if(name.contentEquals("")) break;	// 값이 없는가?
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
