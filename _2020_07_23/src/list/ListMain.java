package list;

public class ListMain {

	public static void main(String[] args) {
	
		List list = new List();
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		print(list.head);
		System.out.println();
		list.delete(5);
		print(list.head);
	}
	
	static void print(Node node) {
		Node temp = node;
		while(temp != null) {
			System.out.printf("%d->",temp.value);
			temp = temp.next;
		}
	}

}
