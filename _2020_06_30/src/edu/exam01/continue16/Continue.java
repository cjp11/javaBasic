package edu.exam01.continue16;

public class Continue {

	public static void main(String[] args) {
		// 1부터 10까지 2의 배수 출력
		
		for(int i=1; i<11; i++) {	// i = i + 2로 두고 i값만 출력해도 됨.
			if(i%2 == 0) System.out.println(i);
		}
		
		for(int i=1; i<11; i++) {	
			if(i%2 != 0) continue;	// 홀수면 
				
			System.out.println(i);
		}

	}

}
