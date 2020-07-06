package edu.exam02.array06;

public class ArrayReference {

	public static void main(String[] args) {
		//int num = 0;
		
		//int[] arr = {10,20,30};
		//스택에는 참조 변수, 힙에 실제 배열 객체
		int[] arr;
		arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		System.out.println(arr);	// [I@15db9742 로 출력되는데 이 주소는 VM이 가지고 있는 가상주소임 
		
		// 참조변수(얕은 복사)
		int[] arr1 = new int[3];
		arr1[0] = arr[0];
		arr1[1] = arr[1];
		arr1[2] = arr[2];
		
		int[] arr2 = arr;
		System.out.println(arr1);	
		System.out.println(arr2);	
		
		arr1[1] = 100;
		System.out.println(arr[1]);
		System.out.println(arr2[1]);
	}

}
