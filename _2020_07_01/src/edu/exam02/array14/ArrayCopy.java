package edu.exam02.array14;

//import java.util.Arrays;

public class ArrayCopy {
	public static void arraycopy(int[] s, int s_idx, int[] d, int d_idx, int cnt  ) {
		for(int i=0; i<cnt; i++) {
			d[d_idx+i] = s[s_idx+i];
		}
		
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] temp = {1,2,0,0,0};
		
		//System.arraycopy(src, srcPos, dest, destPos, length);
		System.arraycopy(temp, 2, arr, 1, 2);
		//System.out.println(Arrays.toString(arr));
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println();
		
		System.arraycopy(arr,2,temp,2,3);
		for(int i=0; i<arr.length; i++) {
			System.out.print(temp[i]+", ");
		}
	}

}
