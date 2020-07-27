package coffee;

import java.util.Scanner;

public class payMain {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Basket bk;
		
		System.out.println("음료 이름: ");
		String name = sc.nextLine();
		System.out.println("음료 수량: ");
		int count = sc.nextInt();
		System.out.println("음료 잔당 가격: ");
		int price = sc.nextInt();
		
		bk = new Basket(name,count,price);
		
		BasketController.addBasket(bk);
		
		
		
		sc.close();
	}

}
