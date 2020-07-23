package stack;

import java.util.Arrays;

class Stack2 {
	int[] arr;
	int top = 0;
	
	Stack2() {
		this(3);
	}
	Stack2(int cnt) {
		arr = new int[cnt];
	}
	
	@Override
	public String toString() {
		return "Stack2 [arr=" + Arrays.toString(arr) + ", top=" + top + "]";
	}
	public void push(int x) {
		if(isFull()) {
			int[] brr = new int[top*2];
			for(int i=0; i<arr.length; i++) {
				brr[i] = arr[i];			// �� ����
			}
			arr = brr;
		
			System.out.println("length�� �ι�� �÷Ƚ��ϴ�.");
			//System.out.println("���� �����÷ο�");
		}
		arr[top++] = x;
	}
	
	public boolean isFull() {		// full�϶� �迭 �ι�� �ø���
		if(top == arr.length) {
			return true;
		}
		return false;
	}
	public int pop() {		
		if(top < arr.length/2) {
			int[] temp = new int[arr.length/2];
			for(int i=0; i<arr.length/2; i++) {
				temp[i] = arr[i];
			}
			arr = temp;
			System.out.println("length�� �������� �ٿ����ϴ�.");
		}
		
		if(!isEmpty()) {
			int res = arr[--top];
			arr[top] = 0;
			return res;
		}
		else {
			System.out.println("������ ������ϴ�.");
			return -1;
		}
		
		
	}
	public boolean isEmpty() {		
		if(top==0) return true;
		return false;
	}
	
	int capacity() {
		return arr.length;
	}
	int dataSize() {
		return top;
	}
}


public class StackMain2 {

	public static void main(String[] args) {
		Stack2 stack = new Stack2();
	//	System.out.println(stack);

		stack.push(1);
		System.out.println(stack);
		stack.push(2);
		System.out.println(stack);
		stack.push(3);
		System.out.println(stack);
		stack.push(4);
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		System.out.println(stack.capacity());
		System.out.println(stack.dataSize());

	
		
		
	}

}
