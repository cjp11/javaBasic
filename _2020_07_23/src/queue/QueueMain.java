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
		// �ڷᱸ���� �� ���� ����� �� ����
		// isEmpty() �� ������ �� front = rear�̹Ƿ� 
		// -> ȯ��ť�� �ٽ� ����������. 
	}

}
