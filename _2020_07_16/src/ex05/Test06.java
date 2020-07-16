package ex05;

import java.util.ArrayList;

public class Test06 {

	public static void main(String[] args) {
		class Cookie{
			String name;
			int price;
			public Cookie(String name, int price) {
				this.name = name;
				this.price = price;
			}
			@Override
			public String toString() {
				return "Cookie [name= " + name +
						", price= " + price + "]";
			}
		}
		ArrayList<Cookie> list = new ArrayList<>();
		list.add(new Cookie("새우깡", 1000));
		list.add(new Cookie("맛동산", 1200));
		list.add(new Cookie("오징어 땅콩", 1300));
		
		for(Cookie c : list) {
			System.out.println(c);
		}
	}
}










