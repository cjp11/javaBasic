package basic_exam;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 사용자가 0을 입력하기 전까지 정수를 입력해서 반환하는
     메서드를 정의하고 사용하세요
   int[] getInputNums();
 */
public class practice02 {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Integer> list = new ArrayList<Integer>();
	static public int[] getInputNums() {
		// 정수입력
		while(true) {
			int a = sc.nextInt();
			if(a!=0) {
				list.add(a);
			}else {
				break;
			}
		}
		// 반환할 참조배열에 값 복사
		int[] arr = new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			arr[i] = list.get(i);
		}
		
		return arr;
	}
	public static void main(String[] args) {
		
		int[] res = null;
		res = practice02.getInputNums();
		
		for(int i=0; i<res.length; i++) {
			System.out.print(res[i]+" ");
		}
	}

}
