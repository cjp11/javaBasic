package basic_exam;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * ����ڰ� 0�� �Է��ϱ� ������ ������ �Է��ؼ� ����ϴ�		-> 0�Է��ϴ� ���� �������� �Է��ߴ� ���� ��� ���. ��, ArrayList ����غ���
     �޼��带 �����ϰ� ����ϼ���
   void printInputNums();
 */
public class practice01 {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Integer> list = new ArrayList<Integer>();
	
	public static void printInputNums() {	//0�� �Է��Ҷ����� �����
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
