package basic_exam;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * ����ڰ� 0�� �Է��ϱ� ������ ������ �Է��ؼ� ��ȯ�ϴ�
     �޼��带 �����ϰ� ����ϼ���
   int[] getInputNums();
 */
public class practice02 {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Integer> list = new ArrayList<Integer>();
	static public int[] getInputNums() {
		// �����Է�
		while(true) {
			int a = sc.nextInt();
			if(a!=0) {
				list.add(a);
			}else {
				break;
			}
		}
		// ��ȯ�� �����迭�� �� ����
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
