package _0702practice;

import java.util.Scanner;

/*
 * �迭���� Ư�� ���� ������ ��Ҹ� ã�ƶ�. ���� ���� ��Ұ� ���� �� ������ ���� �տ� ��ġ�� ��Ҹ�
ã�� ���α׷��� ���� �ڿ� �ִ� ��Ҹ� ã�� ���α׷��� �ۼ��Ͻÿ�.

���� �տ� ��ġ�� ��� ã�� 
���� ��
��� ��: 7
a[0]= 22
a[1]= 57
a[2]= 11
a[3]= 32
a[4]= 91
a[5]= 32
a[6]= 70
ã�� ����: 32
�� ���� a[3]�� �ֽ��ϴ�.


���� �ڿ� �ִ� ��� ã�� 
��� ��: 7
a[0]= 22
a[1]= 57
a[2]= 11
a[3]= 32
a[4]= 91
a[5]= 32
a[6]= 70
ã�� ����: 32
�� ���� a[5]�� �ֽ��ϴ�.
 */
public class practice6_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�迭 ��� ��: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("�迭 ���� ��� ����ŭ ���ʴ�� �Է��Ͻÿ�");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			
			System.out.printf("a[%d]= %d\n", i, arr[i]);
		}
		
		System.out.println("ã�� ����: ");
		int find = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			if(arr[i] == find) {
				System.out.printf("���� �տ� �ִ� ��� -> �� ���� a[%d]�� �ֽ��ϴ�.\n",i);
				break;
			}
		}
		
		for(int i=n-1; i>=0; i--) {
			if(arr[i] == find) {
				System.out.printf("���� �ڿ� �ִ� ��� -> �� ���� a[%d]�� �ֽ��ϴ�.",i);
				break;
			}
		}
		
		sc.close();

	}

}
