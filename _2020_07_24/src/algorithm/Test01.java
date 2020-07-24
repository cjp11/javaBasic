package algorithm;

public class Test01 {
	
	static int[] element = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
	public static void main(String[] args) {
		quickSort(0,element.length-1);
		print();
	}
	static void quickSort(int startIndex, int endIndex) {
		if((endIndex-startIndex) <= 0) return;				// 정렬할 데이터가 1개 이하면
		int pivotIndex = startIndex;
		int storeIndex = pivotIndex + 1;
		
		for(int i= pivotIndex + 1; i<= endIndex; i++) {
			if(element[i] < element[pivotIndex]) {
				swap(i,storeIndex);
				storeIndex++;
			}
		}
		swap(pivotIndex, storeIndex - 1);
		quickSort(startIndex, storeIndex - 2);
		quickSort(storeIndex, endIndex);
		
	}
	static void swap(int index1, int index2) {
		if(index1 == index2) return;
		int temp = element[index1];
		element[index1] = element[index2];
		element[index2] = temp;
	}
	static void print() {
		for(int value : element) {
			System.out.printf("%d, ",value);
		}
	}

}
