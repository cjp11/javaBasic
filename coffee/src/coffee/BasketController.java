package coffee;

import java.util.ArrayList;

public class BasketController {
	static ArrayList<Basket> blist;	// ��ٱ��� ���
	
	static public void addBasket(Basket b) {			//��ٱ��Ͽ� �߰�
		blist.add(b);
	}
	static public void removeBasket(Basket b) {		//��ٱ��Ͽ��� ����
		blist.remove(b);
	}
	static public void payment() {
		
	}
}
