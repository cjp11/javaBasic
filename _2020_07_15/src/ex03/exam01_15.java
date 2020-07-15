package ex03;

import java.util.HashSet;
import java.util.Iterator;

public class exam01_15 {

	public static void main(String[] args) {
		HashSet<String> list = new HashSet<>();
		list.add("홍길동");
		list.add("임꺽정");
		list.add("유관순");
		list.add("이순신");
		list.add("안중근");
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
