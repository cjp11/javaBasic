package ex03;

import java.util.HashMap;
import java.util.Iterator;

public class exam01_16 {

	public static void main(String[] args) {
		HashMap<Integer,String>list = new HashMap<>();
		
		list.put(100,"홍길동");
		list.put(101,"임꺽정");
		list.put(102,"유관순");
		list.put(103,"이순신");
		list.put(104,"안준근");
		
		Iterator<String> iterator = list.values().iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
