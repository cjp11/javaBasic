package edu.exam03.method03;

//import java.util.Scanner;
import java.util.*;
public class Method {
	//public static Scanner sc = new Scanner(System.in);
	
	public static void add() {
		Scanner sc = new Scanner(System.in);	//-> �̷��� ó���ϸ� add() 1�� ����ô� ������µ� 2���̻� �����ϸ� ������
												 // nosuchelemnetexception ���� ���� 
												// �˻���� scanner�� �ѹ� ������ �ٽ� �� �� ���� �����̶�� ��.  
		
		System.out.println("���� �ΰ� �Է�: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int res = a + b;
		System.out.println(res);
		sc.close();
		//System.gc();			-> garbage collection ���� https://yaboong.github.io/java/2018/06/09/java-garbage-collection/
		/*
		 * 
		 * public class FinalizeExample {
	public static void main(String[] args) {
	Counter counter = null;
	for(int i=1; i<=50; i++) {
	counter = new Counter(i);
	counter = null; // counter ��ü�� ������� ����ϴ�.
	System.gc(); // Garbage Collector  ������ ��û�մϴ�.
	}
}
}
�������� �Ҹ�Ǵ� ���� �� �� ���� ���Դϴ�. 
���� �Ҹ�Ǵ� ���� �ƴ϶� �޸��� ���¸� ���� �Ϻθ� �Ҹ��ŵ�ϴ�. 
���������� System.gc()�� Garbage Collector�� ���� ��û������, 
Garbage Collector�� �޸𸮰� �����Ҷ� ,  CPU�� �Ѱ��� ���� JVM�� ���� �ڵ������� ����.
		 */
		
	}
	public static void main(String[] args) {
		
			add();
			add();
			//sc.close();

	}

}
