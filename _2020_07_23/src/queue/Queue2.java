package queue;
//환형큐를 이용해 자료구조를 계속 이용하자.
import java.util.Arrays;

public class Queue2 {
	int[] arr;
	int front = 0;
	int rear = 0;
	
	public Queue2() {
		this(5);
	}
	public Queue2(int cnt) {
		arr = new int[cnt];
	}
	public void put(int x) {
		if(!isFull()) {
			arr[rear] = x;
			rear = (rear+1)%arr.length;
		}
		else {
			System.out.println("큐가 꽉 찼습니다.");
			
			
		}
	}
	public int get() {
		if(!isEmpty()) {
			int temp;
			temp = arr[front];
			front = (front+1)%arr.length;
			return temp;
			
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
		return (rear+1)%arr.length == front;
	}
	public boolean isEmpty() {
		if(front == rear) return true;
		else return false;
	}
	
	
}
