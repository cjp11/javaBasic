package list;
/*
 * concept : tail�� ���� add �Ҷ� Ȱ��
 * 			 head�� ���� ó���� �߰��� ������ ������� ����� �� Ȱ��
 */
public class List {
	Node head;	// ����Ҷ� ������� �ϱ� ���� ����
	Node tail;	// ���� ���� ���� ���� ���� ���õ� �ּ�
	int cnt;
	
	List() {
		head = null;
		tail = null;
	}
	public void add(int value) {
		Node newNode = new Node();
		newNode.value = value;
		newNode.next = null;
		if( tail == null) { 
			this.head = newNode;	// ó�� �־��ִ� ���� ����Ű�� ����Ҷ� �� �ּҺ��� ����
			this.tail = newNode;
		}
		else {
			Node tempNode = new Node();		
			tempNode = tail;			// ���� ����� �ּ� �� ����
			tempNode.next = newNode;	// ������尡 ���� ��� newNode�� ����Ŵ(�ּҰ� ����)
			tail = newNode;
		}
	}
	
	public void delete(int value) {
		Node tempNode = new Node();		
		Node preNode = new Node();
		
		if(head == null) return;
		tempNode = head.next;
		//System.out.println(tempNode.value);
		preNode = head;
		//System.out.println(preNode.value);
		while(tempNode != null) {
			//System.out.println("ss");
			if(preNode.value == value) {
				preNode = tempNode;
				tempNode = tempNode.next;
				break;
			}
			preNode = tempNode;
			tempNode = tempNode.next;
		}
		preNode.next = null;
	}
}
