package coffee;


public class Basket {
	
	private String name;	// 주문할 음료명
	private int count;		// 주문할 음료 수량
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
