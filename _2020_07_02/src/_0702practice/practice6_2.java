package _0702practice;
// ��� ������ 5���� int�� �迭�� ������� 5,4,3,2,1�� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
public class practice6_2 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]= 5-i;
		}
		System.out.println("������� ����ϸ�:");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	
	}

}
