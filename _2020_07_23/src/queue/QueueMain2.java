package queue;

public class QueueMain2 {

	public static void main(String[] args) {
		Queue2 q = new Queue2(3);
		// ť�� 3���� ���� �ֱ�
		q.put(3);
		System.out.println(q);
		q.put(4);
		System.out.println(q);
		q.put(5);
		System.out.println(q);
		// ť�� 3���� ���� ���ʴ�� ����
		q.get();
		System.out.println(q);
		q.get();
		System.out.println(q);
		q.get();
		System.out.println(q);	// front = rear ������ ���̴�.
		System.out.println();
		//������. ���� ���� ť�� ����ٰ� ��µ� ����
		q.get();
		System.out.println(q);
		System.out.println();
		// �ٽ� 3�� ����
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
