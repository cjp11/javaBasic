package queue;

public class QueueMain2 {

	public static void main(String[] args) {
		Queue2 q = new Queue2(3);
		// 큐에 3개의 값을 넣기
		q.put(3);
		System.out.println(q);
		q.put(4);
		System.out.println(q);
		q.put(5);
		System.out.println(q);
		// 큐에 3개의 값을 차례대로 빼기
		q.get();
		System.out.println(q);
		q.get();
		System.out.println(q);
		q.get();
		System.out.println(q);	// front = rear 상태일 것이다.
		System.out.println();
		//빼오자. 뺄게 없어 큐가 비었다고 출력될 것임
		q.get();
		System.out.println(q);
		System.out.println();
		// 다시 3개 넣자
		q.put(6);
		System.out.println(q);
		q.put(7);
		System.out.println(q);
		q.put(8);
		System.out.println(q);	
		System.out.println();
		
		q.put(9);
		System.out.println(q);
		/*q.get();
		System.out.println(q);
		q.get();
		System.out.println(q);
		q.get();
		System.out.println(q);
		System.out.println();
		q.get();
		System.out.println(q);*/
		
	}

}
