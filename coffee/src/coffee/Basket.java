package coffee;


public class Basket {
	
	private String name;	// �ֹ��� �����
	private int count;		// �ֹ��� ���� ����
	private int price;
	
	public Basket() {
		
	}
	
	public Basket(String name, int count, int price) {
		this.name = name;
		this.count = count;
		this.price = price;
	}
	
	public int getCount() {
		return count;
	}
	
	public String getName() {
		return name;
	}
	
	
}
