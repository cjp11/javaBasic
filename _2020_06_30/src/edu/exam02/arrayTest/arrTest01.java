package edu.exam02.arrayTest;
// int 배열 10개 생성, 3의 배수 차례대로 저장하여, 거꾸로 출력.
public class arrTest01 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = 2*i + 1;
		}
		for(int j=arr.length-1; j>=0; j--) {
			System.out.println(arr[j]);
		}

	}

}
