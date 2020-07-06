package _0702practice;
//요소 개수가 5인 double형 배열을 만들고 앞에서부터 1.1, 2.2, 3.3, 4.4, 5.5를 대입해서
//표시하는 프로그램을 작성하시오.
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
