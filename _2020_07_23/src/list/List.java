package list;
/*
 * concept : tail은 값을 add 할때 활용
 * 			 head는 값을 처음에 추가한 값부터 순서대로 출력할 때 활용
 */
public class List {
	Node head;	// 출력할때 순서대로 하기 위해 설정
	Node tail;	// 이전 노드와 현재 노드와 연결 관련된 주소
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
			this.head = newNode;	// 처음 넣어주는 값을 가리키면 출력할때 이 주소부터 시작
			this.tail = newNode;
		}
		else {
			Node tempNode = new Node();		
			tempNode = tail;			// 이전 노드의 주소 값 복사
			tempNode.next = newNode;	// 이전노드가 현재 노드 newNode를 가리킴(주소값 저장)
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
