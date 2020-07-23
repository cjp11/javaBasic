package queue;

public class QueueMain {

	public static void main(String[] args) {
		Queue q = new Queue(3);
		
		q.put(3);
		System.out.println(q);
		q.put(4);
		System.out.println(q);
		q.put(5);
		System.out.println(q);
		q.get();
		System.out.println(q);
		q.get();
		System.out.println(q);
		q.get();
		System.out.println(q);
		
		q.get();
		System.out.println(q);
		q.put(6);
		System.out.println(q);
		q.put(6);
		System.out.println(q);
		// 자료구조를 한 번만 사용할 수 있음
		// isEmpty() 가 성립할 때 front = rear이므로 
		// -> 환형큐로 다시 만들어줘야함. 
	}

}
