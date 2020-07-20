package IO;
// ScoreMain에서 저장한 데이터를 읽는 코드
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ScoreMain2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream in = new FileInputStream("exam089_7.dat");
		BufferedInputStream in2 = new BufferedInputStream(in);
		ObjectInputStream in3 = new ObjectInputStream(in2);
		
		/*
		 * 출력: Score [name= 홍길동, kor= 100, eng= 50, math= 50, sum= 200, avg= 90.5]

		 * 출력 결과를 보면 평균 값은 조작된 값이다.
		 * 저장된 객체의 값을 읽을 때, 조작된 값을 읽을 가능성을 최소화시키는 것이 필요
		 * -> 기존 인스턴스의 변수 값을 가지고 계산해서 나오는 값은 직렬화 대상에서 제외하는 것이 좋다. 
		 * -> 읽는 쪽에서 다시 계산하는 것이 데이터 신뢰성을 높이는 방법이다. 
		 * 
		 */
		
		Score s = (Score)in3.readObject();
		in3.close();
		in2.close();
		in.close();
		System.out.println(s);
		
		
	}

}
