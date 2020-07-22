package step01;

public class Test02 {

	public static void main(String[] args) {
		// 학생의 성적 데이터를 표현하는 클래스 "Score"
		// -> 학생 성적을 Score라는 클래스 문법으로 추상화(데이터화)시켰다.
		
		Score s = new Score();
		s.name = "홍";
		s.kor = 100;
		s.math = 90;
		s.eng = 100;
		
		s.sum = s.kor + s.math + s.eng;
		s.avg = s.sum/3f;
		
		System.out.printf("합계: %d, 평균: %.2f\n", s.sum, s.avg);
		
		// 변수나 매서드 중에서는 sum이나 avg와 같이 임의로 접근해서
		// 값을 변경해서는 안되는 경우가 있다. 
		// 다음과 같이 값을 마음대로 바꿀 수 있다면 데이터의 신뢰성이 무너지게 된다. 
		s.sum = 20;
		s.avg = 100f;
		System.out.printf("합계: %d, 평균: %.2f\n", s.sum, s.avg);

	
	}

}
