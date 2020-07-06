package edu.exam03.recall15;

// ÆÑÅä¸®¾ó
// 5! = 5x4x3x2x1
public class Recall {
	/*static int result = 1;
	public static int factorial(int num) {
		
		if(num > 0) {
			result = result * num;
			factorial(num-1);
		}
		return result;
	}*/
	
	public static int factorial(int n) {
		if(n==1) return 1;
		else return n*factorial(n-1);
	}
	public static void main(String[] args) {
		System.out.println("5!: "+ factorial(5));
		
	}

}
