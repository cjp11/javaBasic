package _0701practice;

import java.util.Scanner;

/*
 * ���庰 ǥ�� ü�� ����ǥ�� ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�. ǥ���� ������ ����(���۰�/���ᰪ/������)��
     �������� �Է¹��� ��.
 * ǥ�� ü�� = ( ���� - 100) x 0.9

	������ ��
	�� cm����: 150
	�� cm����: 180
	�� cm����: 5

	���� ǥ�� ü��
	-----------
	150  45.0
	155  49.5
	...
	180  72.0
 * 
 * 
 * 
 */
public class practice4_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������(���۰�/���ᰪ/������)�� ���������� ���ʴ�� �Է��Ͻÿ�");
		int start = sc.nextInt();
		int end = sc.nextInt();
		int inc = sc.nextInt();
		
		System.out.println("�� cm����: " + start);
		System.out.println("�� cm����: " + end);
		System.out.println("�� cm����: " + inc);
		
		System.out.println("����\t" + "ǥ�� ü��");
		System.out.println("----------------");
		int n = (end - start)/inc + 1;
		//System.out.println(n);
		for(int i=0; i<n; i++) {
			System.out.println((start+i*inc) + "\t" + ((start+i*inc) - 100)*0.9);
		}
		
		sc.close();

	}

}
