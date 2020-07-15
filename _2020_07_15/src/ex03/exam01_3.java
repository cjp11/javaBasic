package ex03;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 배열처럼 인덱스를 다룰 수 있는 목록관리 객체(컬렉션 객체)이다.
 */
public class exam01_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList names = new ArrayList();
		
		String name;
		while(true) {
			name = sc.nextLine();
			if(name.equals("")) 
				break;
			names.add(name);
			
		}
		System.out.println("-------------");
		for(int x=0; x<names.size(); x++) {
			System.out.println(names.get(x));
		}
		sc.close();
	}

}
