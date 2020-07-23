package queue;

import java.util.Arrays;

public class Queue {
	int[] arr;
	int front = 0;
	int rear = 0;
	
	public Queue() {
		this(5);
	}
	public Queue(int cnt) {
		arr = new int[cnt];
	}
	public void put(int x) {
		if(!isFull()) 
			arr[rear++] = x;
		else {
			System.out.println("큐가 꽉 찼습니다.");
		}
	}
	public int get() {
		if(!isEmpty()) {
			return arr[front++];
		}
		else {
			System.out.println("큐가 비었습니다.");
			return -1;
		}
	}
	@Override
	public String toString() {
		return "Queue [arr=" + Arrays.toString(arr) + ", front=" + front + ", rear=" + rear + "]";
	}
	
	public boolean isFull() {
		if(rear == arr.length) return true;
		else return false;
	}
	public boolean isEmpty() {
		if(front == rear) return true;
		else return false;
	}
	
	
}
