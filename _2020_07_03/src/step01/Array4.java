package step01;
// 이 클레스의 멤버들은 객체를 생성해야만 접근가능(사용가능)
public class Array4 {
	int[] arr;	
	/*
	void test() {
		arr = new int[10];
	}
	static void s_test() {	// 객체가 아닌 상태에서 이 함수를 호출 할 수는 있다.
		test();				// 하지만 이 test()함수는 객체를 생성해야만 보이는(사용할 수) 있음. 
	}*/
	/*static void ss-test() {	// 이 상황에서  Array4 클래스 멤버변수인 int[] arr을 -> static int[] arr로 바꾼다면 arr이 동적할당 됨. 
		test();
		arr = new int[10];
	}*/

	
	// 객체 만든 이후에 함수 호출하려고 하는 상황 -> static 을 없애면 클래스 배열을 바로 사용할 수 있음. 
	void initByIndexValue() {
		for(int i=0; i<arr.length; i++) {
			arr[i] = i;
		}
	}
	void sort() {
		int temp;
		for(int x=1; x<arr.length; x++) {
			for(int i=0; i<arr.length-x; i++) {
				if(arr[i] > arr[i+1]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
	}
	
	void printAll(int keyIndex) {
		for(int i=0; i<arr.length; i++) {
			if(keyIndex >=0 && i == keyIndex) {
				System.out.printf("[%d]", arr[i]);
			}
			else
				System.out.printf("%d ",arr[i]);
		}
		System.out.println();
	}
	
	void mix() {
		int index1, index2, temp;
		for(int i=0; i<arr.length; i++) {
			index1 = (int)(Math.random() * arr.length);
			index2 = (int)(Math.random() * arr.length);
			temp = arr[index1];
			arr[index1] = arr[index2];
			arr[index2] = temp;
		}
	}
}
