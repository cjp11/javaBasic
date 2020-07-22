package step01;

public class Test01 {

	public static void main(String[] args) {
		Score s = new Score();
		s.name = "È«";
		s.kor = 100;
		s.math = 90;
		s.eng = 100;
		
		s.sum = s.kor + s.math + s.eng;
		s.avg = s.sum/3f;
		
		System.out.printf("ÇÕ°è: %d, Æò±Õ: %.2f\n", s.sum, s.avg);
	}

}
