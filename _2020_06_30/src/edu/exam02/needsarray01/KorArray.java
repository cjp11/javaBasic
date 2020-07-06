package edu.exam02.needsarray01;

public class KorArray {

	public static void main(String[] args) {
		int[] kor = {99,98,80}; //할당이 된 상태에서는 값을 넣을 수 없다. 
								// 즉, int[] kor = new int[3];
								// kor[0] = 99; ... 이렇게 할 수 없음. 선언과 동시에 초기화 해줘야한다.
		int sum = 0;
		float avg = 0f;
		/*
		int[] eng = new int[5];
		
		kor = eng; // 가능, type 즉, 사이즈가 같으므로, C에서는 불가능 변수 각각이 고유값을 가지기 때문에. 	
					// 이렇게 해버리면 기존 99 98 80값은 나중에 힙에서 가비지 컬렉션이 알아서 처리함. 
		kor[0] = 1;
		kor[1] = 4;
		kor[4] = 6;
		
		System.out.println(kor[4]);
		System.out.println(kor.length);
		System.out.println(eng.length);
		System.out.println(eng[1]);
		*/
		// 
		sum = kor[0] + kor[1] + kor[2];
		avg = (float)sum / 3;
		System.out.printf("총합: %d, 평균: %.2f\n",sum,avg);
	}

}
