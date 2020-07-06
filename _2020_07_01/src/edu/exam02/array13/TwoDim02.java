package edu.exam02.array13;

// 필요한 만큼의 크기만 할당할 수 있음. 
public class TwoDim02 {

	public static void main(String[] args) {
		int[][] arr = new int[3][];
		arr[0] = new int[2];
		arr[1] = new int[4];
		arr[2] = new int[3];
		
		int cnt = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = cnt++;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print("arr[" + i + "]" + "[" + j + "]" + "=" + arr[i][j] + " ");
			}
			System.out.println();
		}
		// 해보기.
		int[] test = {10,11,12,13,14,15};
		arr[1] = test;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print("arr[" + i + "]" + "[" + j + "]" + "=" + arr[i][j] + " ");
			}
			System.out.println();
		}
	

	}

}
