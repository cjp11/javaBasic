package coffee;

import java.util.Scanner;

public class payMain {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Basket bk;
		
		System.out.println("���� �̸�: ");
		String name = sc.nextLine();
		System.out.println("���� ����: ");
		int count = sc.nextInt();
		System.out.println("���� �ܴ� ����: ");
		int price = sc.nextInt();
		
		bk = new Basket(name,count,price);
		
		BasketController.addBasket(bk);
		
		
		
		sc.close();
	}

}
