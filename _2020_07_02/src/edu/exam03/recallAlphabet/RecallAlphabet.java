package edu.exam03.recallAlphabet;

public class RecallAlphabet {

	public static void recallAlphabet(char[] arr, int len) {
		for(int i=0; i<len; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		
		if(len == 1) {
			return;
		}
		else
			recallAlphabet(arr,--len);
	}
	
	public static void main(String[] args) {
		//char[] alpha = {'a', 'b','c','d'); 아래는 같은 표현
		String strAlpha = "abcdef";
		char[] alpha = strAlpha.toCharArray();
		
		recallAlphabet(alpha,alpha.length);
	}

}


