package step01;

public class Array3 {
	int[] arr;	// static을 없애고 인스턴스를 통해 이용하도록 조작. 
	
	static void initByIndexValue(Array3 that) {
		for(int i=0; i<that.arr.length; i++) {
			that.arr[i] = i;
		}
	}
	static void sort(Array3 that) {
		int temp;
		for(int x=1; x<that.arr.length; x++) {
			for(int i=0; i<that.arr.length-x; i++) {
				if(that.arr[i] > that.arr[i+1]) {
					temp = that.arr[i];
					that.arr[i] = that.arr[i+1];
					that.arr[i+1] = temp;
				}
			}
		}
	}
	
	static void printAll(Array3 that, int keyIndex) {
		for(int i=0; i<that.arr.length; i++) {
			if(keyIndex >=0 && i == keyIndex) {
				System.out.printf("[%d]", that.arr[i]);
			}
			else
				System.out.printf("%d ",that.arr[i]);
		}
		System.out.println();
	}
	
	static void mix(Array3 that) {
		int index1, index2, temp;
		for(int i=0; i<that.arr.length; i++) {
			index1 = (int)(Math.random() * that.arr.length);
			index2 = (int)(Math.random() * that.arr.length);
			temp = that.arr[index1];
			that.arr[index1] = that.arr[index2];
			that.arr[index2] = temp;
		}
	}
}
