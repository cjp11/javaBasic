package edu.exam02.array07;

//import java.util.Arrays;

/*
 * <얕은 복사>	-> ~.array06 에 얕은 복사 예제 있음.  
 * 배열 변수에 다른 배열 공간이 있는 배열 변수를 대입
 * hashCode 값만 복사되므로 같은 힙 공간을 가리키게 된다.
 * 이 때는 새로 생성한 배열 변수에서 값을 수정하게 되면
 * 원래 변수를 통해 선언한 배열의 값이 바뀌게 된다.
 * 두 개의 배열 변수는 같은 공간을 가리키게 된다.
 */

/*
 * <깊은 복사>
 * Array.copyOf의 도움을 받으면
 * 깊은 복사가 일어난다.
 * 새로 변수 생성과 동시에 새로운 공간도 할당되어
 * 값들이 복사되므로 2개의 배열 변수들은 각각 자신들의 공간을 가리키게 된다.
 * 그러므로 1개의 배열 변수는 다른 배열 변수에 영향을 미치지 않는다. 
 */

public class DeepCopy {

	public static int[] arraycopy (int[] score, int cnt){
		int[] ret = new int[cnt];
		
		for(int i=0; i<cnt; i++) {
			ret[i] = score[i];
		}
		
		return ret;
	}
	
	public static void main(String[] args) {
		int[] score0 = {10,20,30,40,50};
		int[] score1 = score0;
		int[] score2 = score0;
		
		// 모두 같은 주소 나옴.
		System.out.println(score0);
		System.out.println(score1);
		System.out.println(score2);
		
		score0[0] = 100;
		System.out.println(score0[0]);
		System.out.println(score1[0]);
		System.out.println(score2[0]);
		
		/* 깊은 복사(새로운 공간에 할당되고 score0의 값을 복사 해줌. 즉, 100 20 30 40 50 이 저장 되어있음. 
		int[] score3 = Arrays.copyOf(score0, score0.length);
		
		이것을 아래 처럼 직접 함수로 짜볼 수도 있음. 
		*/
		int[] score3 = arraycopy(score0, score0.length);
		
		
		System.out.println();
		System.out.println(score0);
		System.out.println(score1);
		System.out.println(score2);
		System.out.println(score3);	// 주소값 다름. 
		
		score0[0] = 1000;
		System.out.println(score0[0]);
		System.out.println(score1[0]);
		System.out.println(score2[0]);
		System.out.println(score3[0]);
	}

}
