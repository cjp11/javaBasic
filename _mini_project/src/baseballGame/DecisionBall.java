package baseballGame;

public class DecisionBall {
	static int[] decide(int[] a, int[] b) {
		int res[] = new int[2];	//스트라이크, 볼 값 저장
		int k = 0;
		for(int i=0; i<a.length; i++) {		// 완전탐색
			for(int j=0; j<b.length; j++) {
				if(a[i] == b[j] && i == j) {
					res[k]++;		// 스트라이크 횟수
					break;
				}
				if(a[i] == b[j] && i != j) {
					res[k+1]++;		// 볼 횟수
				}
			}
		}
		return res;
	}
}
