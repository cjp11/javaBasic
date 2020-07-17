package basic_exam;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 사용자가 0을 입력하기 전까지 정수를 입력해서 출력하는		-> 0입력하는 순간 이전까지 입력했던 정수 모두 출력. 즉, ArrayList 사용해봐라
     메서드를 정의하고 사용하세요
   void printInputNums();
 */
public class practice01 {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Integer> list = new ArrayList<Integer>();
	
	public static void printInputNums() {	//0을 입력할때까지 출력함
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
	}
	public static void main(String[] args) {
		//ArrayList<Integer> list = new ArrayList<Integer>();
		while(true) {
			int a = sc.nextInt();
			if(a!=0) {
				list.add(a);
			}else {
				break;
			}
			
		}
		practice01.printInputNums();
		sc.close();
		
	}

}
