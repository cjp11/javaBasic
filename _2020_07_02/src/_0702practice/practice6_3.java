package _0702practice;
//��� ������ 5�� double�� �迭�� ����� �տ������� 1.1, 2.2, 3.3, 4.4, 5.5�� �����ؼ�
//ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
public class practice6_3 {

	public static void main(String[] args) {
		double[] arr = new double[5];
		
		for(int i=0; i<5; i++) {
			arr[i] = 1.1 * (i+1);
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
