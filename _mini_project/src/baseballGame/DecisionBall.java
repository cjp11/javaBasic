package baseballGame;

public class DecisionBall {
	static int[] decide(int[] a, int[] b) {
		int res[] = new int[2];	//��Ʈ����ũ, �� �� ����
		int k = 0;
		for(int i=0; i<a.length; i++) {		// ����Ž��
			for(int j=0; j<b.length; j++) {
				if(a[i] == b[j] && i == j) {
					res[k]++;		// ��Ʈ����ũ Ƚ��
					break;
				}
				if(a[i] == b[j] && i != j) {
					res[k+1]++;		// �� Ƚ��
				}
			}
		}
		return res;
	}
}
