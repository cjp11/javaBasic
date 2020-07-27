package coffee;

import java.util.ArrayList;

public class BasketController {
	static ArrayList<Basket> blist;	// 장바구니 목록
	
	static public void addBasket(Basket b) {			//장바구니에 추가
		blist.add(b);
	}
	static public void removeBasket(Basket b) {		//장바구니에서 삭제
		blist.remove(b);
	}
	static public void payment() {
		
	}
}
