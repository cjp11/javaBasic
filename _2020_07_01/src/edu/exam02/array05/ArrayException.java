package edu.exam02.array05;

public class ArrayException {

	public static void main(String[] args) {
		int[] arr = {10,20,30};
		System.out.println("길이는 " + arr.length);
		
		// ArrayIndexOutOfBoundException 에러 발생 
		System.out.println(arr[arr.length]);

	}

}
