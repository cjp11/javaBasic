package step01;

public class Test02 {

	public static void main(String[] args) {
		// �л��� ���� �����͸� ǥ���ϴ� Ŭ���� "Score"
		// -> �л� ������ Score��� Ŭ���� �������� �߻�ȭ(������ȭ)���״�.
		
		Score s = new Score();
		s.name = "ȫ";
		s.kor = 100;
		s.math = 90;
		s.eng = 100;
		
		s.sum = s.kor + s.math + s.eng;
		s.avg = s.sum/3f;
		
		System.out.printf("�հ�: %d, ���: %.2f\n", s.sum, s.avg);
		
		// ������ �ż��� �߿����� sum�̳� avg�� ���� ���Ƿ� �����ؼ�
		// ���� �����ؼ��� �ȵǴ� ��찡 �ִ�. 
		// ������ ���� ���� ������� �ٲ� �� �ִٸ� �������� �ŷڼ��� �������� �ȴ�. 
		s.sum = 20;
		s.avg = 100f;
		System.out.printf("�հ�: %d, ���: %.2f\n", s.sum, s.avg);

	
	}

}
