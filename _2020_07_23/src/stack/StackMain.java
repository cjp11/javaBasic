package stack;

import java.util.Arrays;

class Stack {
	int[] arr;
	int top = 0;
	
	Stack() {
		this(5);
	}
	Stack(int cnt) {
		arr = new int[cnt];
	}
	
	@Override
	public String toString() {
		return "Stack [arr=" + Arrays.toString(arr) + ", top=" + top + "]";
	}
	public void push(int x) {
		if(isFull()) {
			System.out.println("스택 오버플로우");
			return;
		}
		arr[top++] = x;
	}
	public boolean isFull() {
		if(top == arr.length) return true;
		return false;
	}
	public int pop() {
		if(!isEmpty()) {
			return arr[--top];
		}
		else {
			System.out.println("스택이 비었습니다.");
			return -1;
		}
		
		
	}
	public boolean isEmpty() {
		if(top==0) return true;
		return false;
	}
	
}


public class StackMain {

	public static void main(String[] args) {
		Stack stack = new Stack();
	//	System.out.println(stack);

		stack.push(1);
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
	
		
		
	}

}
