package IO;

import java.io.Serializable;

public class Score2 implements Serializable{
	String name;
	int kor;
	int eng;
	int math;
	
	// 기존 인스턴스 변수의 값을 가지고 계산해서 그 결과를 저장하는 변수는 
	// 직렬화 대상에서 제외(파일로 출력하지 말아라!) 해야 한다.
	// 읽는 쪽에서 다시 계산하는 것이 데이터 신뢰성이나 보안에 유리하다. 
	//-> 방법? transient로 선언한다. 
	transient int sum;
	transient float avg;
	public void compute() {
		this.sum = this.kor + this.eng + this.math;
		this.avg = this.sum/3f;
	}
	
	public String toString() {
		return "Score [name= " + name + ", kor= "+ kor + ", eng= " + eng +
				", math= " + math + ", sum= " + sum + ", avg= " + avg + "]";
	}
}
