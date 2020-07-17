package ex03;

import java.util.ArrayList;

public class exam01_5 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		
		names.add("홍");
		names.add("홍");		//위와 같은 객체(의 주소)저장
		names.add(null);	//null값 저장 가능
		names.add("임");
	
		for(int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		for(String s : names) {
			System.out.println(s);
		}
	}
	
	

}
